//Nicholas Wood
//CS 320
//01/26/2021
//The code test the contact service file

package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ContactService.Contact;
import ContactService.ContactService;


class ContactServiceTest {

	//adding contacts to the list
	@Test
	public void testContactService() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("100", "Harry", "Potter","0123456789", "11010 St E");
		Contact contact2 = new Contact("200", "George", "Weasly", "1234567890", "22020 St E");
		Contact contact3 = new Contact("300", "Fred", "Weasly", "2345678901", "33030 St E");
		assertEquals(true, cs.add(contact1));
		assertEquals(true, cs.add(contact2));
		assertEquals(true, cs.add(contact3));
	}
	
	//making sure the test adding fails
	@Test
	public void testFailAdd() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("100", "Harry", "Potter","0123456789", "11010 St E");
		Contact contact2 = new Contact("200", "George", "Weasly", "1234567890", "22020 St E");
		Contact contact3 = new Contact("300", "Fred", "Weasly", "2345678901", "33030 St E");
		assertEquals(true, cs.add(contact1));
		assertEquals(false, cs.add(contact1));
		assertEquals(true, cs.add(contact2));
		assertEquals(true, cs.add(contact3));
	}
	
	//testing of deletion of a contact
	@Test
	public void testDeleteContactPass() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("100", "Harry", "Potter","0123456789", "11010 St E");
		Contact contact2 = new Contact("200", "George", "Weasly", "1234567890", "22020 St E");
		Contact contact3 = new Contact("300", "Fred", "Weasly", "2345678901", "33030 St E");
		assertEquals(true, cs.add(contact1));
		assertEquals(true, cs.add(contact2));
		assertEquals(true, cs.add(contact3));
		
		assertEquals(false, cs.remove("100"));
		assertEquals(true, cs.remove("200"));
	}
	
	//testing a fail deleting 
	@Test
	public void testDeleteContactFail() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("100", "Harry", "Potter","0123456789", "11010 St E");
		Contact contact2 = new Contact("200", "George", "Weasly", "1234567890", "22020 St E");
		Contact contact3 = new Contact("300", "Fred", "Weasly", "2345678901", "33030 St E");
		assertEquals(true, cs.add(contact1));
		assertEquals(true, cs.add(contact2));
		assertEquals(true, cs.add(contact3));
		
		assertEquals(false, cs.remove("400"));
		assertEquals(true, cs.remove("200"));
	}
	
	//testing a contact update
	@Test
	public void testContactUpdatePass() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("100", "Harry", "Potter","0123456789", "11010 St E");
		Contact contact2 = new Contact("200", "George", "Weasly", "1234567890", "22020 St E");
		Contact contact3 = new Contact("300", "Fred", "Weasly", "2345678901", "33030 St E");
		assertEquals(true, cs.add(contact1));
		assertEquals(true, cs.add(contact2));
		assertEquals(true, cs.add(contact3));
		
		assertEquals(true, cs.update("James", "Potter", "4567890123" , "44040 St E"));
		assertEquals(true, cs.update("Ronald", "Weasly", "5678901234", "55050 St E"));
	}
	
	//testing a contact update fail
	@Test
	public void testContactUpdateFail() {
		ContactService cs = new ContactService();
		Contact contact1 = new Contact("100", "Harry", "Potter","0123456789", "11010 St E");
		Contact contact2 = new Contact("200", "George", "Weasly", "1234567890", "22020 St E");
		Contact contact3 = new Contact("300", "Fred", "Weasly", "2345678901", "33030 St E");
		assertEquals(true, cs.add(contact1));
		assertEquals(true, cs.add(contact2));
		assertEquals(true, cs.add(contact3));
		
		assertEquals(false, cs.update("James", "Potter", "4567890123" , "44040 St E"));
		assertEquals(true, cs.update("Ronald", "Weasly", "5678901234", "55050 St E"));
		
		
	}
	

}
