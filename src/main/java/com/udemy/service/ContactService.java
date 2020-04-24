package com.udemy.service;

import java.util.List;


import com.udemy.model.ContactModel;

public interface ContactService {
	
	
	List<ContactModel> getList();
	
	ContactModel add(ContactModel contactModel);
		
	ContactModel findById(Integer id);
	
	boolean delete(Integer id);

}
