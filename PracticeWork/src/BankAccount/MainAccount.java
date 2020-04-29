package BankAccount;

import java.io.ObjectInputStream.GetField;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account mustafa=new Account();
		//mustafa.withdraw(100);
		//mustafa.getAccNum();
		System.out.println("Customer Account number is "+ mustafa.getAccNum());
		System.out.println("Customer Email address is "+ mustafa.getCustEmail());
		//mustafa.deposit(100);
		mustafa.withdraw(100);
		//mustafa.deposit(10);
		//mustafa.withdraw(5);
		//mustafa.withdraw(7.0);
		
		//Account faiz=new Account("Fasi","Fasi@gmail.com","87878787");
		//System.out.println("New Account has been created with customer account number as "+faiz.getAccNum()+" with currrent balance "+faiz.getBal());

	}

}
