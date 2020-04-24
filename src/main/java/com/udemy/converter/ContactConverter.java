package com.udemy.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {

	
	public Contact modelToEntity(ContactModel contactModel) {
		Contact contact = new Contact();
		contact.setId(contactModel.getId());
		contact.setFirstName(contactModel.getFirstname());
		contact.setLastName(contactModel.getLastname());
		contact.setCity(contactModel.getCity());
		contact.setTelephone(contactModel.getTelephone());
		
		return contact;
	}
	
	
	public ContactModel entityToModel(Contact contact) {
		ContactModel contactModel = new ContactModel();
		contactModel.setId(contact.getId());
		contactModel.setFirstname(contact.getFirstName());
		contactModel.setLastname(contact.getLastName());
		contactModel.setCity(contact.getCity());
		contactModel.setTelephone(contact.getTelephone());
		
		return contactModel;
	}
	
	
	public List<ContactModel> listEntityToListModel(List<Contact> contacts){
		List<ContactModel> contactModels = new ArrayList<>();
		
		for (Contact contact : contacts) {
			ContactModel contactModel = entityToModel(contact);
			contactModels.add(contactModel);			
		}
		
		return contactModels;
	}
}
 