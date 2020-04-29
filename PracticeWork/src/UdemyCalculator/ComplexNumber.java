package UdemyCalculator;

public class ComplexNumber {
	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getReal()
	{
		return this.real;
	}
	public double getImaginary()
	{
		return this.imaginary;
	}
	public void add(double r, double i)
	{
		this.real+=r;
		this.imaginary+=i;
	}
	
	public void add(ComplexNumber c)
	{
		this.real+=c.real;
		this.imaginary+=c.imaginary;
	}
	public void sub(double r, double i)
	{
		this.real-=r;
		this.imaginary-=i;
		
	}
	public void sub(ComplexNumber c)
	{
	this.real-=c.real;
	this.imaginary-=c.imaginary;
	}

}
