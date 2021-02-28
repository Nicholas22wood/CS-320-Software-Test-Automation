//Nicholas Wood
//CS 320
//01/26/2021
//The code creates an Contact with a contact ID, first name, last name, phone, and address

package ContactService;

public class Contact{

	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		//checking to see if the contact ID is null or too long
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		//checking to see if the first name is null or too long
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		//checking to see if the last name is null or too long
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		//checking to see if the phone number is null or too long
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		//checking to see if address is null or too long
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		//setting the multiple fields if it passes all the criteria
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
			}
	//getting contact id 
	public String getContactID() {
		return contactID;
	}
	//getting first name
	public String getFirstName() {
		return firstName;
	}
	//getting last name
	public String getLastName() {
		return lastName;
	}
	//getting phone number
	public String getPhone() {
		return phone;
	}
	//getting address
	public String getAddress() {
		return address;
	}
	//setting contact ID
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	//setting first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//setting last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//setting phone number
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//setting address
	public void setAddress(String address) {
		this.address = address;
	}

}
