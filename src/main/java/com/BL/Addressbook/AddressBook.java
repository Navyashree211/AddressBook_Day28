/*
 * UC-10: Ability to get number of contact by city or state.
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
