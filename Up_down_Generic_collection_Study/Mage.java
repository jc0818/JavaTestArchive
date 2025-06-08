
public class Mage extends Character{
	public Mage(String name, int hp) {
	    super(name, hp);
	}

	@Override
	public void attack() {
	    System.out.println(name + "이(가) 마법구슬로 공격합니다!");
	}

	void castSpell() {
	    System.out.println(name + "이(가) 파이어볼을 시전합니다!");
	}

}
