import java.util.Scanner;

public class ScannerArray1 {
	
	//Scanner class will accept input values from Keyboard 
public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Defining an Array to give it as an input type to scanner class
		int[] integerarray=getintegers(5);
		for (int i=0;i<integerarray.length;i++)
		{
			System.out.println("Element "+i+"of ArrayInteger "+integerarray[i]);
		}
		System.out.println("Average of the numbers are "+getAverage(integerarray));
	}
	
	public static int[] getintegers(int num)
	{
		System.out.println("Enter "+num + "Integer Values");
		int[] value=new int[num];
		for(int j=0;j<value.length;j++)
		{
			value[j]=scanner.nextInt();
		}
		return value;
		
	}
	public static double getAverage(int[] num)
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
		}
		return (double) sum/(double)num.length; 
	}
	

}
