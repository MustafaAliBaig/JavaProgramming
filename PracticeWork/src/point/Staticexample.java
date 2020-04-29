package point;

public class Staticexample {
	
	private static String name;
	
	public Staticexample(String name)
	{
		Staticexample.name=name;
	}

	public void printname()
	{
		System.out.println("this should print the name of staticexample " +name);
	}
}
