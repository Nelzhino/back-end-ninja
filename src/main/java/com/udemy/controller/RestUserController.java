package com.udemy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.model.ContactModel;
import com.udemy.service.ContactService;

@RestController
@RequestMapping("/user")
public class RestUserController {

	@Autowired
	@Qualifier("contactService")
	private ContactService contactService;
	
	@GetMapping("/list")
	public ResponseEntity<List<ContactModel>> getAll(){
		
		List<ContactModel> contactModel = contactService.getList();
		
		return new ResponseEntity<List<ContactModel>>(contactModel, HttpStatus.OK);
	}
	
	@GetMapping("/listExample")
	public List<ContactModel> getAllWinOut(){
		return contactService.getList();
	}
}
