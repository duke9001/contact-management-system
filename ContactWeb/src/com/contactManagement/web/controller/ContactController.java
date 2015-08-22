package com.contactManagement.web.controller;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.contactManagement.dao.ContactDaoLocal;
import com.contactManagement.persistence.Contact;

/**
 * contact information controller 
 * @author uditha dissanayake
 * @version 1.0 (22/8/2015)
 * 
 */
public class ContactController {
	
	ContactDaoLocal contactDaoLocal;
	
	private Contact contact = new Contact();
	/*
	 * constructor
	 * look up an contactDaoLocal object from the naming service and pass it name of the object that want to retrieve
	 */
	public ContactController(){
		Context ctx;
		try {
			ctx = new InitialContext();
			contactDaoLocal= (ContactDaoLocal) ctx.lookup("ContactDao/local");
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/* index page ,create contact button function 
	 * @return return to add contact form page
	 */
	public String addContactPage(){
		return "addContactForm";
	}
	
	/*
	 * add contact forum, add contact information button function
	 * @return if condition pass return to success page else go to fail 
	 */
	public String addContactAction() {
		try {
			contactDaoLocal.add(contact);
			return "success";
		} catch (Exception e) {
			return "failed";
		}
		
	}
	/*
	 * if success after adding information return to index page
	 * @return retunr to index page
	 */
	public String returnMenu() {
		return "index";
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
	
}
