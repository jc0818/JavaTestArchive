
abstract class Character {
	String name;
	int hp;
	
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void attack()
	{
		System.out.println("무기가없네,,, 주먹 공격!!");
	}
	
	void printStatus()
	{
		System.out.println(name + " | HP : " + hp);
	}
}
