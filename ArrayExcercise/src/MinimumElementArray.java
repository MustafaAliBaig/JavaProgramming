import java.util.Scanner;
//This is an example of finding minimum arrays in the array list
//We used Integer Function to find the min value
public class MinimumElementArray {
	private static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Count");
		int count=scanner.nextInt();
		scanner.nextLine();
		
		int[] returnedArray=readIntegers(count);
		int returnedMin=findMin(returnedArray);
		
		System.out.println("Minimum Number is "+returnedMin);

	}
	
	private static int[] readIntegers(int count)//This Function will take the input for number of Integrs that has to be 
	//taken from the keyboard
	{
		int[] array=new int[count];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter a Number");//It will Prompt a message to enter a number
			int number=scanner.nextInt();//number variable will store elements which are entered from the keyboard
			scanner.nextLine();//This Statement lets the cursor to move to another line
			array[i]=number;//This will store array of numbers which are entered from keyboard
		}
		return array;//This will return array which has been processed in above section
	}
	private static int findMin(int[] array) {//This function helps in finding the minimum value in the arrray
			int min=Integer.MAX_VALUE;
	for(int i=0;i<array.length;i++)
	{
		int value=array[i];
		
		if(value<min) {
			min=value;
		}
	}
	return min;
	}
}
