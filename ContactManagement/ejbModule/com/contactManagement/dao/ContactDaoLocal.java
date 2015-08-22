package com.contactManagement.dao;

import java.util.List;

import javax.ejb.Local;

import com.contactManagement.persistence.Contact;

/*
 * business logic interface
 * @author uditha dissanayake
 * @version 1.0 (22/8/2015)
 */

@Local
public interface ContactDaoLocal {
	/*
	 * add new contact
	 * @param contact  add (nic , firstName , lastName)
	 */
	public void add(Contact contact);
	
	/*
	 * update current contact
	 * @param contact update (firstName , lastName)
	 */
	public void update(Contact contact);
	
	/*
	 * delete new contact
	 * @param contact remove contact by nic 
	 */
	public void delete(Contact contact);
	
	/*
	 * get all contacts 
	 * 
	 */
	public List<Contact> getAll();
	
	/*
	 * get contact using nic
	 * @param nic contact nic number
	 */
	public Contact getContactByNic(String nic);
	
	
	

}
