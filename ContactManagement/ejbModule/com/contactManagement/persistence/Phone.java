package com.contactManagement.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the phone database table.
 * @author uditha dissanayake
 * @version 1.0 (22/8/2015)
 */
@Entity
@NamedQuery(name="Phone.findAll", query="SELECT p FROM Phone p")
public class Phone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String number;

	//bi-directional many-to-many association to Contact
	@ManyToMany(mappedBy="phones")
	private List<Contact> contacts;

	public Phone() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<Contact> getContacts() {
		return this.contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}