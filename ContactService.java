//Nicholas Wood
//CS 320
//01/26/2021
//The code updates and adds the contact based on ContactID

package ContactService;
import java.util.ArrayList;


public class ContactService {
	//creating a list of contacts
	private ArrayList<Contact> contacts;
	
	//creating a default constructor
	public ContactService() {
		contacts = new ArrayList<>();
	}

	//adding a contact to the list as long as their is not an existing contact
	public boolean add(Contact contact) {
		//checking to see if contact is present
		boolean existing = false;
		for (Contact c : contacts) {
			if (c.equals(contact)) {
				existing = true;
			}
		}
		//if not existing than we add it and return the argument as true
		if(!existing) {
			contacts.add(contact);
				System.out.println("Contact Added Successfully!");
				return true;
			}
			else {
				System.out.println("Contact Existing");
				return false;
			}
		}
		
	//removing a contact based on contact ID if in the list
	public boolean remove(String contactID) {
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				contacts.remove(c);
				System.out.println("Contact removed Successfully");
			}
		}
		System.out.println("Contact not existing");
		return false;
		
	}
	
	//updating the contact based on contact ID 
	public boolean update(String contactID, String firstName, String lastName, String address) {
		for (Contact c : contacts) {
			if(c.getContactID().equals(contactID)) {
				if(!firstName.equals(""))
					c.setFirstName(firstName);
				if(!lastName.equals(""))
					c.setLastName(lastName);
				if(!address.equals(""))
					c.setAddress(address);
				System.out.println("Contact updated");
				return true;
			}
		}
		System.out.println("Contact not present");
		return false;
	}
	
}







