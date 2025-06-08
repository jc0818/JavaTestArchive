
public class Dog extends Animal{
	public Dog(String name) {
		super(name);//상속개념 
		// TODO Auto-generated constructor stub
	}

	void treat()
	{
		System.out.println(name + "강아지를 진료합니다.");
	}
	
	void Bark()
	{
		System.out.println("멍멍!");
	}
}
