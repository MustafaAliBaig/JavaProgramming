package InheritanceExample;

public class Cricle {
	
	private double radius;

	public Cricle(double radius) {
		if(this.radius<0)
			this.radius = 0.0;
		else
			this.radius=radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return (radius*radius*Math.PI);
	}
}
