package UdemyExcercises;

import java.util.Scanner;

public class MainMobile {
	private static Scanner scanner=new Scanner(System.in);
	private static MobilePhone mobilephone=new MobilePhone("203 690 6879");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		/*Create a program that implements a simple mobile phone with the following Capabilities
		 * Able to store, modify, remove and query contact names.
		 * you will want to create a separete class for Contacts (name and phone Number).
		 * Create a master class (MobilePhone) that holds the ArrayList of Contacts 
		 * The Mobilephone class has the functionality listed above./
		 * Add a menu of options that are available
		 * Options: quit, Print List of Contacts , add new contact, update existing contact, remove contact
		 * and search find contact.
		 * When adding or updating be sure to check if the contact already exists(use name)
		 * Be USre not to expose the inner workings of the ArrayList to Mobile Phone
		 * Example No ints, no.get(i) etc
		 * Mobile Shuld do every thing with Mobile Contact Classs
		 */
		boolean quit=false;
		startPhone();
		printActions();
		while(!quit)
		{
			System.out.println("\n Enter action: (6 to Show available actions)");
			int action=scanner.nextInt();
			scanner.nextLine();
			
			switch (action) {
			case 0:
				System.out.println("\n Shutting down...");
				quit=true;
				break;
			case 1:
				mobilephone.printContacts();
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			}
			
		}
	}
	/*addNewContact is created in the main function
	 * It is a void function
	 * We will take the entry from the Keyboard 
	 * we have created static method createContact in the MobileContact class as when ever we want to 
	 * create  a new contact we always calls this convience method as we need not create an new object every time 
	 * We will pass object of MobileContact to addNewContact method which is in MobilePhone class and check whether 
	 * Contact exists or not and hence add the contact to the class */
	private static void addNewContact()
	{
		System.out.println("Enter new Contact Name:");
		String name=scanner.nextLine();
		System.out.println("Enter Phone Number: ");
		String phone=scanner.nextLine();
		MobileContact newContact=MobileContact.createContact(name, phone);
		if(mobilephone.addNewContact(newContact))
		{
			System.out.println("New Contact added: name= " +name+ ", Phone = "+phone);
		}
		else
		{
			System.out.println("Cannot add,"+name+ "Already on File ");
		}
	}
	/*updateContact() is created as to update the existing record for that first we need to check is not null
	 * Steps We need to call exisitg queryContact() and get the record and store it in object of MobileContact class
	 * if existingContactRecord is not null then we need to update the existing contact
	 * we have to again call static method createContact form MobileContact class and overide the existing name and number
	 * 
	 * */
	private static void updateContact()
	{
		System.out.println("Enter the Existing contact name: ");
		String name=scanner.nextLine();
		MobileContact existingContactRecord=mobilephone.queryContact(name);
		if(existingContactRecord==null) {
			System.out.println("Contact not found");
		return;
		}
		System.out.println("Enter new Contact name: ");
		String newName=scanner.nextLine();
		System.out.println("Enter new Contact Phone Number: ");
		String newPhone=scanner.nextLine();
		MobileContact newContact=MobileContact.createContact(newName,newPhone);
		if(mobilephone.updateContact(existingContactRecord, newContact))
		{
			System.out.println("Successfully updated record");
		}
		else
		{
			System.out.println("Error updating record..");
		}
	}
	/*static removeContact() is to remove the record from the class 
	 * for that we will check existingContactRecord is not null
	 * then we will  call removeContact() and remove the record successfully*/
	private static void removeContact()
	{
		System.out.println("Enter the Existing contact name: ");
		String name=scanner.nextLine();
		MobileContact existingContactRecord=mobilephone.queryContact(name);
		if(existingContactRecord==null) {
			System.out.println("Contact not found");
		return;
		}
		if(mobilephone.removeContact(existingContactRecord))
		{
			System.out.println("Successfully Deleted");
		}
		else
		{
			System.out.println("Error in deleting the record");
		}
	}
	/* queryContact() is created to search for the record in the Array list
	 *  it will check for the existingContactRecord is not null and then print out the result of the record found successfully*/
	private static void queryContact()
	{
		System.out.println("Enter the Existing contact name: ");
		String name=scanner.nextLine();
		MobileContact existingContactRecord=mobilephone.queryContact(name);
		if(existingContactRecord==null) {
			System.out.println("Contact not found");
		return;
		}
		System.out.println("Name: "+existingContactRecord.getName()+" Phone Number is "+existingContactRecord.getPhno());
	}
	
	/*StartPhone() just displays the options as phone is started we can develop the code in Future use*/
private static void startPhone()
	{
		System.out.println("Starting Mustafa Phone now.....");
	}
/*PrintActions() it will display the available options on the screens when this method is called*/
private static void printActions()
{
	System.out.println("\n Available actions :\npress");
	System.out.println("0 - To Shut Down\n"+ 
						"1 - To print contacts\n"+
						"2 - To add a new Contact\n"+
						"3 - To update existing an existing contact\n"+
						"4 - To Remove an Existing contact\n"+
						"5 - Query if an Existing contact exists\n"+
						"6 - To Print a list of available actions.");
	System.out.println("Choose your Actions: ");
	}
}
