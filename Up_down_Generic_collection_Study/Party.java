import java.util.ArrayList;

public class Party<T extends Character> {
	private ArrayList<T> members = new ArrayList<>();

    public void addMember(T character) {
        members.add(character);
    }

    public void startBattle() {
        for (T member : members) {
            member.attack();

            if (member instanceof Mage) {
                ((Mage) member).castSpell();
            } else if (member instanceof Archer) {
                ((Archer) member).shootArrow();
            }

            member.printStatus();
            System.out.println("------------------");
        }
    }
}
