//Nicholas Wood
//CS 320
//01/26/2021
//The code test the contact file

package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ContactService.Contact;

class ContactTest {

	//testing creating a contact
	@Test
	void testContact() {
		Contact Contact = new Contact("12345", "John", "Doe", "2535551234", "1234 South St");
		assertTrue(Contact.getContactID().equals("12345"));
		assertTrue(Contact.getFirstName().equals("John"));
		assertTrue(Contact.getLastName().equals("Doe"));
		assertTrue(Contact.getPhone().equals("2535551234"));
		assertTrue(Contact.getAddress().equals("1234 South St"));
	}
	
	//incorrect id length
	@Test
	void testContactContactID() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("12345678910", "John", "Doe", "2535551234", "1234 South St");
		});	
	}
	
	//incorrect first name length
	void testContactFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("12345", "Johnny12355", "Doe", "2535551234", "1234 South St");
		});	
	}
	
	//incorrect last name length
	void testContactLastName() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("12345", "Joh5", "Doe12345678", "2535551234", "1234 South St");
		});	
	}
	
	//incorrect phone number length
	void testContactPhone() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("12345", "John", "Doe", "122535551234", "1234 South St");
		});	
	}
	
	//address is null length 
	void testContactAddress() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("12345", "John", "Doe", "2535551234", "");
		});	
	}
}
