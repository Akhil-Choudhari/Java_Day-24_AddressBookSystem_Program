package AddressBookSystem;

public class AddressBook {

	private class Contact {
		String firstName, lastNmae, address, city, state, emailId;
		int zipCode;
		long mobileNumber;
	}

	
	public void printContact() {
		Contact person = new Contact();
		person.firstName = "Akhil";
		person.lastNmae = "Choudhari";
		person.address = "Om Colony";
		person.city = "Ashoknagar";
		person.state = "Madhya Pradesh";
		person.zipCode = 473331;
		person.mobileNumber = 8435422005L;
		person.emailId = "akhil.choudhari.ac@gmail.com";
		System.out.println("Contact Details");
		System.out.println("Name          : " + person.firstName + " " + person.lastNmae + "\n" + "Address       : "
				+ person.address + "\n" + "City          : " + person.city + "\n" + "State         : " + person.state
				+ "\n" + "ZipCode       : " + person.zipCode + "\n" + "MobileNumber  : " + person.mobileNumber + "\n"
				+ "EmailId       : " + person.emailId + "\n");
	}

	
	public static void main(String[] args) {
		
		AddressBook addressBook = new AddressBook();
		
		addressBook.printContact();

	}
}