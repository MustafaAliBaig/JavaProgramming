package ChallengePart1;

public class Hamburgers {
	private String name;
	private String breadrollType;
	private String MeatType;
	private double price;
	private String add1Name;
	private double add1Price;
	
	private String add2Name;
	private double add2Price;
	
	private String add3Name;
	private double add3Price;
	
	private String add4Name;
	private double add4Price;
	
	public Hamburgers( String name, String breadrollType, String meatType, double price) {
		this.breadrollType = breadrollType;
		MeatType = meatType;
		this.price = price;
		this.name=name;
	}

	public void addHamburgerAddition1(String name,double price)
	{
		this.add1Name=name;
		this.add1Price=price;
	}
	public void addHamburgerAddition2(String name,double price)
	{
		this.add2Name=name;
		this.add2Price=price;
	}
	public void addHamburgerAddition3(String name,double price)
	{
		this.add3Name=name;
		this.add3Price=price;
	}
	public void addHamburgerAddition4(String name,double price)
	{
		this.add4Name=name;
		this.add4Price=price;
	}
	
	public double itemizeHamburger()
	{
		double hamburgerprice=this.price;
		System.out.println(this.name +" Hamburger "+ "on a  "+this.breadrollType +"roll "+"With Meat "
				+ "Type "+this.MeatType+ "price is "+this.price);
		if(this.add1Name!=null)
		{
			hamburgerprice+=this.add1Price;
			System.out.println("Added "+ this.add1Name + "For Extra price "+this.add1Price);
		}
		if(this.add2Name!=null)
		{
			hamburgerprice+=this.add2Price;
			System.out.println("Added "+ this.add2Name + "For Extra price "+this.add2Price);
		}
		if(this.add3Name!=null)
		{
			hamburgerprice+=this.add3Price;
			System.out.println("Added "+ this.add3Name + "For Extra price "+this.add3Price);
		}
		if(this.add4Name!=null)
		{
			hamburgerprice+=this.add4Price;
			System.out.println("Added "+ this.add4Name + "For Extra price "+this.add4Price);
		}
		return hamburgerprice;
	}
}
