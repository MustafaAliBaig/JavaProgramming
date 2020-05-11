import java.util.Scanner;

public class defangedVersion {
private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the Ipaddress which you want to defanged it ");
		String ipaddress=scan.nextLine();
		String defangedVersion=ipaddress.replace(".", "[.]");
		System.out.println("Printing original list "+ipaddress);
		System.out.println("Now pritning defanged list "+ defangedVersion);
	}
}
