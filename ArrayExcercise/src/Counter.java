

class count{
	private int int1;
public int 	getInt1()
{
	return int1;
	}
public void counter()
{
	for(int i=0;i<5;i++)
	{
		int1+=i+1;
	}		
}
}

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		count c1=new count();
		c1.counter();
		System.out.println("We have counted number of numbers "+c1.getInt1());
		
	}

}
