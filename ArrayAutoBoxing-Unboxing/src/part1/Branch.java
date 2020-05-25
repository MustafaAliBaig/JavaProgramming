package part1;

import java.util.ArrayList;

public class Branch {
	private String branchname;
	
	private ArrayList<Customer> customers;
	
	public Branch(String name)
	{
		this.branchname=name;
		this.customers=new ArrayList<Customer>();
	}

	public String getBranchname() {
		return branchname;
	}
	
	public boolean newCustomer(String customerName, double initalAmount)
	{
		if(findCustomer(customerName)==null)
		{
			this.customers.add(new Customer(customerName, initalAmount));
			return true;
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String customerName,double amount) {
		Customer existingCustomer=findCustomer(customerName);
		if(existingCustomer!=null)
		{
			existingCustomer.addTrascation(amount);
			return true;
		}
		return false;
		
	}
	
	
private Customer findCustomer(String customerName)
{
	for (int i=0;i<this.customers.size();i++)
	{
		Customer checkedCustomer=this.customers.get(i);
		if(checkedCustomer.getCutomername().equals(customerName)) {
			return checkedCustomer;
		}
	}
	return null;
	}

}
