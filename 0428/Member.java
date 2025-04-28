
public class Member {
	private String sName;
	private int iStuNum;
	
	public Member()//기본 생성자
	{
		this("", 0);
	}
	public Member(String sName, int iStuNum) // 매개변수를 받는 생성자
	{
		this.sName = sName;
		this.iStuNum = iStuNum;
	}
	
	public String getName()
	{
		return sName;
	}
	
	public int getStuNum()
	{
		return iStuNum;
	}
	
	
	 @Override
	 public String toString() {
	    return "Student ID : " + iStuNum + "\n" + "Name : " + sName;
	 }
}
