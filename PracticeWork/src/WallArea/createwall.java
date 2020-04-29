package WallArea;

public class createwall {
	private double width;
	private double height;
	
	
	public createwall() {
		this(10.00,20.00);
	}


	public createwall(double width, double height) {
		this.width = width;
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		if(width<0)
		this.width = 0.0;
		else 
			this.width=width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		if(height<0)
			this.height=0.0;
		else
		this.height = height;
		
	}
	public double getArea()
	{
		return width*height;
	}
	
	
	

}
