package basic1;

/*This is the example of customize enum types
 * By default enums have their own string values, we can also assign some custom values to enum
 * Note we are defining parameterized constructor and which is private
 *As if we define it as public or protected it will initialize more than one object type
 *Also we need to create an getter method to get the value of enums*/
enum Traffic{
	RED("Stop"),GREEN("Go ahead"),YELLOW("Slow down");
private String signal;
	public String getSignal() {
		return signal;
	}
	
	private Traffic(String signal)
	{
		this.signal=signal;
	}
}

public class CustomizeEnum {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lets print each enum name and action associated with it
		Traffic[] signals= Traffic.values();

		for(Traffic signal:signals) {
			System.out.println("Name: "+ signal.name()+" Action :"+signal.getSignal());

	}

	}
}
