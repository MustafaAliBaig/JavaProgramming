package VipAccount;

public class Vip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createVip noor=new createVip();
		System.out.println("get vip customer name "+noor.getName());
		
		System.out.println("The credit limit of "+noor.getName() + " is "+noor.getCreditlimit());
		System.out.println("The email address of " +noor.getName()+ " is "+ noor.getEmail());
		createVip anwar=new createVip("Anwar", 2000.00);
		System.out.println("get vip customer name "+anwar.getName());

		System.out.println("The credit limit of "+anwar.getName() + " is "+anwar.getCreditlimit());
		System.out.println("The email address of " +anwar.getName()+ " is "+ anwar.getEmail());

	}

}
