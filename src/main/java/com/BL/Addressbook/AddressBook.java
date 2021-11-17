/*
 * UC-14: Ability to Read or Write the AddressBook with Persons Contact as CSV File .
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
