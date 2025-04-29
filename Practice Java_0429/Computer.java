
public class Computer {
	private final static String[] osType = {"Windows 7","Apple Mac","Android","Not OS Information"};
	private int Ram;
	private int OsInfo;
	public Computer()
	{
		this(3,0);
	}
	
	
	
	public Computer(int OsInfo, int Ram)
	{
		this.OsInfo = OsInfo;
		this.Ram = Ram;
		
	}
	
	
	public void print()
	{
		System.out.println("운영체제: " + osType[OsInfo] + ", 메인메모리: " + Ram);
	}
	
	
}
