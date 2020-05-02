package ChallengePart1;

public class DeluxeBurger extends Hamburgers {

	public DeluxeBurger() {
		super("Deluxe", "White Bread", "Tuna", 14.54);
		// TODO Auto-generated constructor stub
		
		super.addHamburgerAddition1("Chips", 2.75);
		super.addHamburgerAddition2("Drink", 1.91);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("You cannot add any item to Deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("You cannot add any item to Deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("You cannot add any item to Deluxe burger");
		
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("You cannot add any item to Deluxe burger");
	}
	
	
	

}
