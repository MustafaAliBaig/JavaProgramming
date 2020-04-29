package UdemyCalculator;

public class Calci {
	private Double FirstNumber;
	private Double SecondNumber;
	
	public void setFirstNumber(Double num1)
	{
		this.FirstNumber=num1;
	}
	public Double getFirstNumber()
	{
		return this.FirstNumber;
	}
	public void setSecondNumber(Double num2)
	{
		this.SecondNumber=num2;
	}
public Double getSecondNumber()
{
	return this.SecondNumber;
	}
	public Double getAdditionResult()
	{
		return this.FirstNumber+SecondNumber;
	}
	public Double getSubtractionResult()
	{
		return this.FirstNumber-SecondNumber;
	}
	public Double getMultiplicationResult() {
		return this.FirstNumber*SecondNumber;
		
	}
	public Double getDivisionResult()
	{
		if (SecondNumber==0)
			return 0.0;
		else
			
		return this.FirstNumber/SecondNumber;
	}

}
