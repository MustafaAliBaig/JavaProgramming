package CarpetCostCalculator;

public class CarpetCostCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carpet c1=new Carpet(3.5);
		Floor f1=new Floor(2.75,4.0);
	Calculator cal=new Calculator(f1, c1);
		System.out.println("total= "+ cal.getTotalCost());


	}

}
