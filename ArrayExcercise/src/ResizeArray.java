import java.util.Arrays;
import java.util.Scanner;

public class ResizeArray {
	
	private static Scanner ScanArray=new Scanner(System.in);
	private static int[] baseArray=new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 10 integers to print");
		InputArray();
		PrintArray(baseArray);
		resizearray();
		baseArray[10]=44;
		baseArray[11]=97;
		PrintArray(baseArray);
	}
	
	private static void InputArray()
	{
		for(int i=0;i<baseArray.length;i++)
			baseArray[i]=ScanArray.nextInt();
		
	}
	
	private static void PrintArray(int[] array)
	{
	for(int i=0;i<array.length;i++)
		System.out.print(array[i]+" ");
	System.out.println();
	}
	private static void resizearray()
	{
		int[] original=baseArray;
		
		baseArray=new int[12];
		
		for (int i = 0; i < original.length; i++) {
			baseArray[i]=original[i];
		}
	}
}
