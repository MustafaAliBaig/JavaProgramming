package CarpetCostCalculator;

public class Floor {
	private double width;
	private double lenght;
	
	public Floor(double width, double lenght) {
		if(this.width<0) {
		this.width = 0.0;}
		else {
			this.width=width;}
		if(this.lenght<0) {
		this.lenght = 0.0;}
		else {
			this.lenght=lenght;}
	}

	public double getArea()
	{
		return this.lenght*this.width;
	}
}
