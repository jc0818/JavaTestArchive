
public class Warrior extends Character{
	public Warrior(String name, int hp) {
	    super(name, hp);
	}

	@Override
	public void attack() {
	    System.out.println(name + "이(가) 검으로 공격합니다!");
	}

	void shieldBlock() {
	    System.out.println(name + "이(가) 방패로 공격을 막습니다!");
	}

}
