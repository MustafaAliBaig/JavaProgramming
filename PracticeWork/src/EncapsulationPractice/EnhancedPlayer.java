package EncapsulationPractice;

public class EnhancedPlayer {
	private String name;
	private int hitpoint=100;
	private String weapon;
	public EnhancedPlayer(String name, int health, String weapon) {
		super();
		this.name = name;
		if(health>0 && health <=100)
		{
		this.hitpoint = hitpoint;
		}
		this.weapon = weapon;
	}
	
	public void loseHealth(int damage)
	{
		this.hitpoint =this.hitpoint-damage;
		if(this.hitpoint<=0)
		{
			System.out.println("Player knocked out ");
			//Reduces the life of the player
		}
	}

	public int getHeath() {
		return hitpoint;
	}
	
	

}
