package com.contactManagement.dao;

import java.util.List;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.contactManagement.persistence.Contact;

/*
 * business logic implementation 
 * @author uditha dissanayake
 * @version 1.0 (22/8/2015)
 */

@Stateless
public class ContactDao implements ContactDaoLocal{

	@PersistenceContext
	EntityManager entityManager;
	
	public void add(Contact contact) {
		entityManager.persist(contact);
		
	}

	public void update(Contact contact) {
		entityManager.merge(contact);		
	}

	public void delete(Contact contact) {
		entityManager.remove(contact);
		
	}

	public List<Contact> getAll() {
		
		return entityManager.createQuery("FROM Contact").getResultList();
	}

	public Contact getContactByNic(String nic) {
		
		return entityManager.find(Contact.class, nic);
	}
	


}
