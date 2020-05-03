import java.util.Scanner;

public class SortingArray {
	
	/*This program is related to sorting array numbers
	 * */
	
	
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Arr1=getIntegers(6);
		int[] sorted=sortArray(Arr1);
		printedarray(sorted);
		

	}
	
	public static int[] getIntegers(int value)
	{
		System.out.println("Enter Number of Numbers "+value +" to sort:\r");
		int[] Arr2=new int[value];
		for(int i=0;i<Arr2.length;i++)
		{
			Arr2[i]=sc.nextInt();
		}
		return Arr2;
	}
	public static void printedarray(int[] Arr3)
	{
		for(int i=0;i<Arr3.length;i++)
		{
			System.out.println("Value of  arrays at "+ i+" is "+Arr3[i]);
		}
	}
	
	public static int[] sortArray(int[] Arr4)//This is the Sorted Array function which helps in sorting the values 
	//was entered from the key board
	{
	int [] sortedInteger=new int[Arr4.length];//Arr4.length will give you exact length which has been passed from 
	//the keyboard
	for(int i=0;i<Arr4.length;i++)
	{
		sortedInteger[i]=Arr4[i];//iterating through Arr4[] array and storing in sortedInteger[]
		}
	boolean flag=true;//This flag is set to true initially 
	int temp;//This is the temporary value assiged to be used while swaping the elements in the while loop
	while(flag)//While Loop for checking the values in the Arraylist
	{
		flag=false;//Here flag is set to false as indicating that nothing wrong has been detected in the Array list 
		//so far 
		
	for(int i=0;i<sortedInteger.length-1;i++)//Here we have value sortedInteger.length-1 because we will be checking upto 
		//array last but one
	{
		if(sortedInteger[i]<sortedInteger[i+1])//Comparing between next element in the array list
		{
			temp=sortedInteger[i];//IF the condition meets then we are storing sortedInteger[i] value which was found less than the 
			//next value in the array
			sortedInteger[i]=sortedInteger[i+1];
			
			sortedInteger[i+1]=temp;
			flag=true;//now Flag is set to true so as to indicate that Wrong element is detected in the list
		}
	}
	}
	return sortedInteger;
	}
}
