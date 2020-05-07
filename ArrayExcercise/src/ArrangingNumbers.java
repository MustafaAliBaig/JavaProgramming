import java.util.Scanner;

public class ArrangingNumbers {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number of numbers");
		int printresult=scanner.nextInt();
		PrintArrange(printresult);
		

	}
public static void PrintArrange(int count)
{
	int[] Arr1=new int[count];
	for(int i=0;i<Arr1.length;i++)
	{
		for(int j=1;j<i;j++)//   for(A;B;C);---->1.A 2.B 3.D 4.C
							//		D;
		{
			System.out.println(j);
			
		}
	}
	}
}
