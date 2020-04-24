package com.udemy.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.converter.ContactConverter;
import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;
import com.udemy.repository.ContactRepository;
import com.udemy.service.ContactService;

@Service("contactService")
public class ContactsServiceImpl implements ContactService{

	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;
	
	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;
	
	
	@Override
	public List<ContactModel> getList() {
		return contactConverter.listEntityToListModel(contactRepository.findAll());
	}

	@Override
	public ContactModel add(ContactModel contactModel) {
		Contact contact =  contactRepository.save(contactConverter.modelToEntity(contactModel));
		return contactConverter.entityToModel(contact);
	}

	@Override
	public ContactModel findById(Integer id) {
		Contact contact = contactRepository.findById(id).get();
		return contactConverter.entityToModel(contact);
	}

	@Override
	public boolean delete(Integer id) {
		contactRepository.deleteById(id);
		return Boolean.TRUE;
	}

}
