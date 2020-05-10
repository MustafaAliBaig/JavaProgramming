import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	//public static Scanner scanArray=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ReverseArray AR=new ReverseArray();
		System.out.println("Enter the number of numbers you want to reverse");
		int[] Arraytoprint=readingarray(5);
		AR.reverse(Arraytoprint);*/
		int[] Ar1= {1,2,3,4,5,6};
		System.out.println("Original Array before sorting "+Arrays.toString(Ar1));
		reverse(Ar1);
		System.out.println("Array in reverse order is " + Arrays.toString(Ar1));
		
		
	}
	
	/*public static int[] readingarray(int Alenght)
	
	{
		int[] localarray=new int[Alenght];
		for (int i=0; i<localarray.length;i++)
		{
			int Inputkey=scanArray.nextInt();
			localarray[i]=Inputkey;
		}
		return localarray;
	}
	*/
	private static void reverse(int[] Inputarray)
	{
		
		int maxIndex=Inputarray.length-1;
		int halflength=Inputarray.length/2;
		for(int i=0;i<halflength;i++)
		{
			int temp=Inputarray[i];
			Inputarray[i]=Inputarray[maxIndex-i];
			Inputarray[maxIndex-i]=temp;
			
		}
	}
}
