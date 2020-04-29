
public class SetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SetGet1 example=new SetGet1();
		//System.out.println("What is the name of "+example.getName1());
		example.setName1("noor");
		System.out.println("Set Name is having this name " + example.getName1());
		example.setMarks(100);
		System.out.println("The Number in the example set is "+ example.getMarks());
	}

}
