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
	/*05/18/2020
	 * code has been updated as when we want to update the contact with already existing contact doesnot give any 
	 * error message saying we have same contact name
	 * */
	public boolean updateContact(MobileContact oldContact,MobileContact newContact) {
		int foundPosition=findContact(oldContact);
		if(foundPosition<0)
		{
			System.out.println(oldContact.getName() +", was not found.");
		return false;
		}else if(findContact(newContact.getName())!=-1)
		{
			System.out.println("Contact with Name "+newContact.getName()+ " Already Exists. Update "
								+ "Uppdate was unsuccessfull.");
		}
		this.myContacts.set(foundPosition, newContact);
		System.out.println(oldContact.getName()+", Was replaced with "+newContact.getName());
		return true;
	}
	/*Remove Contact Method is added Challenge Part 2
	 * 1.It will check for existing contact which has been passed as record
	 * 2.if doesnt found it returns false
	 * else we would be going to myContact ArrayList and searching with the index and removing the contact
	 * the finally returns true so as to indicate that contatct has been removed successfully*/
	public boolean removeContact(MobileContact contact)
	{
		int foundPosition=findContact(contact);
		if(foundPosition<0)
		{
			System.out.println(contact.getName() +", was not found.");
		return false;
		}
		this.myContacts.remove(foundPosition);
		System.out.println(contact.getName()+ " , Was Deleted ");
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
	/*Query Contact has been added in Challenge Part 2
	 *This method would return the contact which has been successfully found in the array list
	 *in this method we are calling findContact method which has MobileContact record parameter   
	 *and it will return contact if found successfully
	 *else it would return Null*/
	
public String queryContact(MobileContact contact)
{
	if(findContact(contact)>=0)
	{
		return contact.getName();
	}
	return null;
	}
/*We have added printContact() function
 * We will check entire arrayList of contacts and 
 * search by each contact and print the details*/

public MobileContact queryContact(String name)
{
	int position=findContact(name);
	if(position>=0)
	{
		return this.myContacts.get(position);
	}
	return null;
	}

public void printContacts()
{
	System.out.println("Contact List ");
	for (int i=0;i<this.myContacts.size();i++)
	{
		System.out.println((i+1)+"."+
							this.myContacts.get(i).getName()+ " -->"+
							this.myContacts.get(i).getPhno());
	}
	}
}
