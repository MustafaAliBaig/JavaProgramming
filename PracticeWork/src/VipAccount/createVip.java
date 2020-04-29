package VipAccount;

public class createVip {
	
	private String name;
	private double creditlimit;
	private String email;
	
	
	public createVip() {
		this("Mirza Noorullah Baig" ,1000.00,"noor@gmail.com");
		
	}
	


	public createVip(String name, double creditlimit) {
		this(name, creditlimit,"anwar@email.com");
	}



	public createVip(String name, double creditlimit, String email) {
		super();
		this.name = name;
		this.creditlimit = creditlimit;
		this.email = email;
	}



	public String getName() {
		return name;
	}



	public double getCreditlimit() {
		return creditlimit;
	}



	public String getEmail() {
		return email;
	}
	
	
	

}
