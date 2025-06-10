package shape;

public class Circle implements Shape{
	private double radius;
	private double PI = 3.141592;
	public Circle(double r)
	{
		this.radius = r;
	}
	
	public double getArea()
	{
		return PI * radius * radius;
	}
	
	public double getPerimeter()
	{
		return 2 * PI * radius;
	}
}
