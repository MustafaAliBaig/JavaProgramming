package UdemyExcercises;

import java.util.ArrayList;

public class MobilePhone {

	private String myNumber;
	private	ArrayList<MobileContact> myContacts;//We have included Arraylist as contact list will increase based on the 
	//requirements we are going to add it. Basic operation is storage of Data.
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts=new ArrayList<MobileContact>();
	}
	
	public boolean  addNewContact(MobileContact contact) {
		if(findContact(contact.getName())>=0) {
			System.out.println("Contact is already on file");
		return false;
		}
		myContacts.add(contact);
		return true;
	}
	
	public boolean updateContact(MobileContact oldContact,MobileContact newContact) {
		int foundPosition=findContact(oldContact);
		if(foundPosition<0)
		{
			System.out.println(oldContact.getName() +", was not found.");
		return false;
		}
		this.myContacts.set(foundPosition, newContact);
		System.out.println(oldContact.getName()+", Was replaced with "+newContact.getName());
		return true;
	}
	private int findContact(MobileContact contact)
	{
		return this.myContacts.indexOf(contact);
	}
	private int findContact(String contactName)
	{
	for(int i=0;i<this.myContacts.size();i++)
	{
	MobileContact contact=this.myContacts.get(i);
	 	if(contact.getName().equals(contactName)) {
					return i;
	}
	}
	return -1;
	}

}
