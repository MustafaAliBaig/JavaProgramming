package BankAccount;


public class Account {
	private String accNum;
	private double bal;
	private String custName;
	private String custEmail;
	private String custPno;
	//Deposit() would not return any thing as we are depositing the new balance
	//Deposit() will be having one local parameter "Deposit Amount" so as to increase the value of initial balance
	
	public void deposit(double depositAmount)
	{
		this.bal+=depositAmount;
		System.out.println("New Current Balance  after new deposit "+this.bal);
	}
	
	public Account() {
		this("12345a" , 100.00,"Mustafa","Mus@gmail.com","99999999");
		System.out.println("This is default constructor");
	}

	public Account(String accNum, double bal, String custName, String custEmail, String custPno) {
		super();
		System.out.println("This is parameterized Constructor ");
		this.accNum = accNum;
		this.bal = bal;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custPno = custPno;
	}
	
	public Account(String custName, String custEmail, String custPno) {
		
		this("100101",10101,custName,custEmail,custPno);
	}

	public void withdraw(double newTransaction)
	{
		if(this.bal<newTransaction) {
		//if(this.bal-newTransaction)
			
			System.out.println("Insufficient Funds trying to withdraw money " +newTransaction+" Which is less than current balance "+this.bal );}
		else {
			this.bal-=newTransaction;
		System.out.println("New balance after withdraw amount of " + newTransaction+" is "+ this.bal);
		}
		}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustPno() {
		return custPno;
	}
	public void setCustPno(String custPno) {
		this.custPno = custPno;
	}
	
	

}
