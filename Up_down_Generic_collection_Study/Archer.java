
public class Archer extends Character{
	public Archer(String name, int hp) {
	    super(name, hp);
	}

	@Override
	public void attack() {
	    System.out.println(name + "이(가) 활을 쏩니다!");
	}

	void shootArrow() {
	    System.out.println(name + "이(가) 날카로운 화살을 발사합니다!");
	}

}
