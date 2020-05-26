package part1;

public class ArrayBoxingUnboxingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Your job is to create a simple banking application
		 *There should be a bank Class
		 *It should have an arrayList of Branches
		 *Each Branch should have an ArrayList of Customers
		 *The Customer class should have an  arrayList of Doubles(Transactions)
		 *Customer:
		 *Name, and the ArrayList of Doubles.
		 *Branch:
		 *Need to be able to add a new customer and initial transaction amount
		 *Also needs to add additional Transactions for that customer/Branch
		 *Bank:
		 *Add a new branch
		 *Add a customer to that branch with initial transaction
		 *Add a transaction for an existing customer for that branch
		 *Show a list of customers for a particular branch and optionally a list
		 *of their transactions
		 *Demonstration Autoboxing and Unboxing in your code
		 *HInt: Transactions
		 *Add data Validation.
		 *E.g. check if exists, or does not exists, etc.
		 *Think about where you are adding the code to perform certain actions
		 **/
		Bank bank =new Bank("Citi Bank");
		bank.addBranch("Los Angeles");
		bank.addCustomer("Los angeles", "Mustafa", 50.56);
		bank.addCustomer("Los angeles", "Noor", 20.96);
		bank.addCustomer("Los angeles", "Anwar", 45.67);
		
		bank.addBranch("Bridgeport");
		bank.addCustomer("Brideport", "Hajera", 130.26);
		
		bank.addCustomer("Los angeles", "Mustafa", 22.56);
		bank.addCustomer("Los angeles", "Mustafa", 12.96);
		bank.addCustomer("Los angeles", "Anwar", 45.67);
		
		bank.listCustomers("Los angeles", true);
		
		if(!bank.addCustomer("San deigo", "Khaseem", 333.2))
		{
			System.out.println("Error in displaying San deigo Branch");
		}
		
		if(!bank.addBranch("Bridgeport"))
		{
			System.out.println("Brigdeport Branch already Exists");
		}
		
		if(!bank.addCustomerTransaction("Bridgeport", "Munawar", 22.1))
		{
			System.out.println("Customer doesnot Exists at the Branch");
		}
		
		if(!bank.addCustomer("Bridgeport", "Mustafa", 31.11))
		{
			System.out.println("Customer Mustafa Already Exists on file");
		}

	}

}
