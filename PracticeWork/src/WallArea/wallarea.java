package WallArea;

public class wallarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createwall wall1=new createwall(5,4);
		System.out.println("The Wall Area is "+wall1.getArea());
		
		createwall wall2=new createwall();
		wall2.setHeight(-1.2);
		System.out.println("The area of the wall2 is "+wall2.getArea());
		

	}

}
