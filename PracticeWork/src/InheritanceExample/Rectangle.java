package InheritanceExample;

public class Rectangle {
private double width;
private double length;
public Rectangle(double width, double length) {
	if(this.width<0)
		this.width = 0.0;
	else
		this.width=width;
	if(this.length<0)
		this.length = 0.0;
	else 
		this.length=length;
}

public double getWidth()
{
	return width;
	
}
public double getLength()
{
	return length;
	}

public double getArea()
{
return width*length;	
}
}
