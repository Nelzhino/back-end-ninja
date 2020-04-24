package com.udemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.udemy.model.ContactModel;
import com.udemy.service.ContactService;

@Controller()
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	@Qualifier("contactService")
	private ContactService contactService;

	
	// (hasRole('ROLE_USER') and hasRole('ROLE_ADMIN'))
	@PreAuthorize("hasRole('ROLE_USER')")
	@GetMapping("/contactform")
	public String showContactForm(Model model, 
			@RequestParam(name = "id", required = false) Integer id) {
		
		if(id != null && id > 0) {
			ContactModel contact = contactService.findById(id);
			model.addAttribute("contact", contact);	
		}
		else {
			model.addAttribute("contact", new ContactModel());			
		}
		return "contactform";
	}
	
	@GetMapping("/cancel")
	public String cancel() {
		return "redirect:/contacts/list";
	}

	@GetMapping("/list")
	public String listContact(Model model) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("contacts", contactService.getList());
		model.addAttribute("username", user.getUsername());
		return "contacts";
	}
	
	
	@PostMapping("/add")
	public String save(@ModelAttribute(name = "contact") ContactModel contactModel) {
		contactService.add(contactModel);
		return "redirect:/contacts/list";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam(name = "id") Integer id) {
		contactService.delete(id);
		return "redirect:/contacts/list";
	}
		
}
