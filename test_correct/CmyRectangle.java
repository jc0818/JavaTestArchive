
public class CmyRectangle {
	private CmyPoint oPoint1;
	private CmyPoint oPoint2;
	
	 public CmyRectangle() {
		 oPoint1 = new CmyPoint(0, 0); // 기본 중심은 (0,0)
		 oPoint2 = new CmyPoint(0, 0);
	    }
	 
	 
	
	public CmyRectangle(int X1,int Y1,int X2,int Y2)
	{
		oPoint1 = new CmyPoint(X1,Y1);
		oPoint2 = new CmyPoint(X2,Y2);
		
	}
	
	public int FirstX()
	{
		return oPoint1.getX();
	}
	
	public int FirstY()
	{
		return oPoint1.getY();
	}
	
	public int SecondX()
	{
		return oPoint2.getX();
	}
	
	public int SecondY()
	{
		return oPoint2.getY();
	}
	
	
	private int getWidth()
	{
		return Math.abs(FirstX() - SecondX());
	}
	
	private int getHeight()
	{
		return Math.abs(FirstY() - SecondY());
	}
	
	public boolean checkSqu()
	{
		boolean bCheck = false;
		if(getHeight() == getWidth())
		{
			bCheck = true;
		}
		return bCheck;
	}
	
	public int getSquSize()
	{
		return getHeight() * getWidth();
	}
	
	
	
	
	
	
	
	
	
}
