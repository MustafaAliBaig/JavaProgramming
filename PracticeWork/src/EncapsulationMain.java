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
