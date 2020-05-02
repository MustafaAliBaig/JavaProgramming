package ChallengePart1;

public class HealthyBurger extends Hamburgers {
	private String healthyExtra1Name;
	private double healthyExtra1Price;
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	public HealthyBurger( String meatType, double price) {
		super("Healthy", "LongGrain", meatType, price);
	}
	
	public void addHealthyAddition1(String name,double price)
	{
		this.healthyExtra1Name=name;
		this.healthyExtra1Price=price;
	}
	
	public void addHealthyAddition2(String name,double price)
	{
		this.healthyExtra2Name=name;
		this.healthyExtra2Price=price;
	}

	@Override
	public double itemizeHamburger() {
		// TODO Auto-generated method stub
		double hamburgerPrice= super.itemizeHamburger();
		if(this.healthyExtra1Name !=null)
		{
			hamburgerPrice +=healthyExtra1Price;
			System.out.println("Added  " +this.healthyExtra1Name + "for an Extra "+ this.healthyExtra1Price);
		}
		if(this.healthyExtra2Name !=null)
		{
			hamburgerPrice +=healthyExtra2Price;
			System.out.println("Added  " +this.healthyExtra2Name + "for an Extra "+ this.healthyExtra2Price);
		}
		return hamburgerPrice;
	}
	
	
	
	

}
