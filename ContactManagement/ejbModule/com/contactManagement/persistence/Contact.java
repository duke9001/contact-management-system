package com.contactManagement.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the contact database table.
 * @author uditha dissanayake
 * @version 1.0 (22/8/2015)
 */
@Entity
@NamedQuery(name="Contact.findAll", query="SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nic;

	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	private String fname;

	private String lname;

	//bi-directional many-to-many association to Address
	@ManyToMany
	@JoinTable(
		name="contact_address"
		, joinColumns={
			@JoinColumn(name="nic")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id")
			}
		)
	private List<Address> addresses;

	//bi-directional many-to-many association to Phone
	@ManyToMany
	@JoinTable(
		name="contact_phone"
		, joinColumns={
			@JoinColumn(name="nic")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id")
			}
		)
	private List<Phone> phones;

	public Contact() {
	}

	public String getNic() {
		return this.nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Phone> getPhones() {
		return this.phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

}