
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Party<Character> party = new Party<>();
		  party.addMember(new Warrior("강철전사", 120));
	        party.addMember(new Mage("불꽃마법사", 80));
	        party.addMember(new Archer("명사수", 100));

	        party.startBattle();
	}

}
