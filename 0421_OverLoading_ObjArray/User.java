
public class User {
	String name,email,phone;
	//This 개념 공부+사용방법 공부 ㄱ
	public User(String name,String email,String phone)
	{
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public User(String name)
	{
		this(name,"이메일 없음","전화번호 없음");
	}
	
	public User(String name, String email)
	{
		this(name,email,"전화번호 없음");
	}
	
	public void printInfo()
	{
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Phone : " + phone);
	}
	
}
