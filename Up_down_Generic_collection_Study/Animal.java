
abstract public class Animal {//추상개념
	String name;
	
	public Animal(String name)
	{
		this.name = name;
	}
	
	
	void treat()
	{
		System.out.println("동물을 진료합니다.");
	}
}
