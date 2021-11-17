/*
 * UC-11: Ability to sort the entries in the address book alphabetically by person's name .
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
