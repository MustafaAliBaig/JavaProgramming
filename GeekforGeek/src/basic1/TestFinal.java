package basic1;


public class TestFinal {
	public final int x;
	public TestFinal(int t1)
	{
		this.x=t1;
	}
	TestFinal()
	{
		this(20);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestFinal t1=new TestFinal(10);
System.out.println("Testing t1 " +t1.x);

TestFinal t2=new TestFinal();
System.out.println("Testing t2 "+t2.x);
	}

}
