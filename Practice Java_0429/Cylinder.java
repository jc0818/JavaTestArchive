
public class Cylinder {
	Circle C;
	private double Height;
	
	public Cylinder(Circle C,double Height) {
		this.Height = Height;
		this.C = C;
	}
	
	public double calcCylinder()
	{
		return C.getArea() * Height;
	}
}
