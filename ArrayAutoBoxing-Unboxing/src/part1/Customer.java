package part1;

import java.util.ArrayList;

public class Customer {
	private String cutomername;
	private ArrayList<Double> transactions;
	public Customer(String cutomername,double initalAmount) {
		this.cutomername = cutomername;
		this.transactions= new ArrayList<Double>();
		addTrascation(initalAmount);
	}
	
	public void addTrascation(double amount)
	{
		this.transactions.add(amount);
	}

	public String getCutomername() {
		return cutomername;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}
}
