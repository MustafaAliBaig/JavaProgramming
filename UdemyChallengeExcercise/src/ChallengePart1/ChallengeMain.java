package ChallengePart1;

public class ChallengeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hamburgers hamburger=new Hamburgers("Basic", "9 grain wheat", "Tuna", 5.0);
		double price=hamburger.itemizeHamburger();
		hamburger.addHamburgerAddition1("tomato", 0.35);
		hamburger.addHamburgerAddition2("onion", 0.40);
		hamburger.addHamburgerAddition3("Avacado", 0.8);
		hamburger.addHamburgerAddition4("Cillies", 0.2);
		System.out.println("The price of Hamburger now after adding addon is " +hamburger.itemizeHamburger());
		
		HealthyBurger healthy=new HealthyBurger("Chicken", 5.06);
		healthy.addHamburgerAddition1("Egg", 1.04);
		healthy.addHealthyAddition2("Mayoneese", 0.5);
		System.out.println("Total Healthy Burger Price is"+healthy.itemizeHamburger());
		
		DeluxeBurger deluxe=new DeluxeBurger();
		deluxe.addHamburgerAddition3("Bscuit", 20.4);
		deluxe.itemizeHamburger();
		

	}

}
