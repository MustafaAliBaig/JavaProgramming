package UdemyExcercises;

public class MobileContact {
	
	private String name;
	private String phno;
	
	public MobileContact(String name, String phno) {
		this.name = name;
		this.phno = phno;
	}

	public String getName() {
		return name;
	}

	public String getPhno() {
		return phno;
	}
	public static MobileContact createContact(String name, String phno)
	{
		return new MobileContact(name, phno); 
	}
}
