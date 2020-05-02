<<<<<<< HEAD
package EncapsulationPractice;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*This is example of Player using no encapsulations techniques which may leads to lot of errors in the code
		 * here for example if we modify name field to Fullname in player class then we need to again modify the code
		 * in the main class as player.name would become unrecognizable
		 */
		/*Player player=new Player();
		player.name="Tim";
		player.health=20;
		player.weapon="Sword";
		
		int damage=10;
		player.loseHealth(damage);
		System.out.println("Remaining Health = "+player.healthRemaining());
		
		damage=11;
		player.loseHealth(damage);
		System.out.println("Remaining Health ="+player.healthRemaining());*/
		/*Below is the Example of Enhanced player and we are using encapsulation technique
		 * We are using constructor instead of field name directly so in case of any change in the field name in the subclass
		 * in here it is Player class wont effect functionalty of the code*/
		
		/*EnhancedPlayer player=new EnhancedPlayer("Tim",200, "Sword");
		System.out.println("Initial Health is "+player.getHeath());*/
		
		/*Below is the example of Excapsulation in printer class
		 * 
		 */
		Printer printer=new Printer(50, true);
		System.out.println("Initial Page Count = " +printer.getPagesPrinted());
		
		int pagesPrinted=printer.printPages(4);
		System.out.println("Pages printed was "+pagesPrinted + "New total print count for printer = "+printer.getPagesPrinted());
		
		int addingTone=printer.addToner(40);
		System.out.println("Toner Level is increased upto "+addingTone);
		
		pagesPrinted=printer.printPages(5);
		System.out.println("Pages printed was "+pagesPrinted + "New total print count for printer = "+printer.getPagesPrinted());
		

	}

}
=======
package EncapsulationPractice;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Player player=new Player();
		player.name="Tim";
		player.health=20;
		player.weapon="Sword";
		
		int damage=10;
		player.loseHealth(damage);
		System.out.println("Remaining Health = "+player.healthRemaining());
		
		damage=11;
		player.loseHealth(damage);
		System.out.println("Remaining Health ="+player.healthRemaining());*/
		
		EnhancedPlayer player=new EnhancedPlayer("Tim",200, "Sword");
		System.out.println("Initial Health is "+player.getHeath());

	}

}
>>>>>>> origin
