package point;

public class createpoint {
	private int x;
	private int y;
	
	public createpoint() {
		this(0,0);
	}

	public createpoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance()
	{
		return Math.sqrt((x-0)*(x-0)+(0-y)*(0-y));
	}
public double distance(int x1,int y1)
{
	return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
public double distance(createpoint s)
{
	return distance(s.x,s.y);//here s.x and s.y will point out to instances of second object created
	
	}
}
