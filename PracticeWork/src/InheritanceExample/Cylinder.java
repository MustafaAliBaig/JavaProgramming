package InheritanceExample;

public class Cylinder extends Cricle{
	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		if(this.height<0)
			this.height = 0.0;
		else 
			this.height=height;
	}
	public double getHeight()
	{
		return this.height=height;
		
	}
	public double getVolume()
	{
		return getArea()*height;
	}
	

}
