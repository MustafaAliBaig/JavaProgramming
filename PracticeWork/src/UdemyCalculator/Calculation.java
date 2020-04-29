package UdemyCalculator;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci cal=new Calci();
		cal.setFirstNumber(5.0);
		cal.setSecondNumber(6.0);
		
		/*System.out.println("The First Number is "+cal.getFirstNumber());
		System.out.println("The Second Number is "+cal.getSecondNumber());
		
		System.out.println("-------------------------------------------");
		
		System.out.println("The Addition Operation is "+ cal.getAdditionResult());
		System.out.println("The Subtraction Operation is "+cal.getSubtractionResult());
		System.out.println("The Multiplication Operation is "+ cal.getMultiplicationResult());
		System.out.println("The Division Operation is "+cal.getDivisionResult());*/		
		
		ComplexNumber one=new ComplexNumber(1.0, 1.0);
		one.add(1.0, 1.0);
		System.out.println("Getting real values "+one.getReal());
		
		one.sub(1.0, 1.0);
		System.out.println("Getting real values "+one.getReal());
	}

}

