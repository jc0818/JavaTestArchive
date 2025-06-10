package shape;

public class Rectangle implements Shape{
	private double w;
	private double h;
	
	public Rectangle(double w, double h)
	{
		this.w = w;
		this.h = h;
	}
	
	public double getArea()
	{
		return w * h;
	}
	
	public double getPerimeter()
	{
		return 2 * (w + h);
	}
}
