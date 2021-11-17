/*
 * UC-13: Ability to Read or Write the AddressBook with Persons Contact into a File using File IO .
 * 
 * @author : Navaya Shree
 */
package com.BL.Addressbook;

import java.util.List;

public class AddressBook {    
	private List<ContactPerson> contacts;

	public List<ContactPerson> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactPerson> contacts) {
		this.contacts = contacts;
	}
}
