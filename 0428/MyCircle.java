
public class MyCircle {
	private Point p;
	private int iRadius;
	
	public MyCircle()
	{
		p = new Point(0,0);
		iRadius = 0;
	}
	
	public MyCircle(int x,int y, int iRadius)
	{
		p = new Point(x,y);
		this.iRadius = iRadius;
	}
	
	public int getX()
	{
		return p.getX();
	}
	
	public int getY()
	{
		return p.getY();
	}
	
	public int getRadius()
	{
		return iRadius;
	}
}
