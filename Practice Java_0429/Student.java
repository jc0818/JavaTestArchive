
public class Student {
	private String sMajor;
	private int iStuNum;
	
	public Student()
	{
		this("",0);
	}
	public Student(String sMajor)
	{
		this.sMajor = sMajor;
		
	}
	public Student(int iStuNum)
	{
		this.iStuNum = iStuNum;
		
	}
	public Student(String sMajor, int iStuNum)
	{
		this.sMajor = sMajor;
		this.iStuNum = iStuNum;
	}
	public String getMajor()
	{
		return sMajor;
	}
	
	public int getStuNum()
	{
		return iStuNum;
	}
	
}
