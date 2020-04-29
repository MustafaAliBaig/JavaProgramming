package InheritanceExample;

public class Car  extends Vehicle{

	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	

	public Car(String name, String size,int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
	    this.wheels=wheels;
		this.doors=doors;
		this.gears=gears;
		this.isManual=isManual;
		// TODO Auto-generated constructor stub
		this.currentGear=1;
	}
	
	public void changeGear(int currentGear)
	{
		this.currentGear=currentGear;
		System.out.println("Car.SetCurrentGear(): Changed to "+ this.currentGear + "Gear .");
	}
	
	public void changeVelocity(int speed, int direction) {
		move(speed, direction);
		System.out.println("Car. ChangeVelocity(): Velocity "+speed +" directions "+direction);
		
	}
}
