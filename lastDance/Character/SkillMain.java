package Character;
import java.util.Scanner;

public class SkillMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SkillManager manager = new SkillManager();

		while(true)
		{
		
			System.out.println("\n=== 캐릭터 스킬 관리 시스템 ===");
	        System.out.println("1. 캐릭터 추가");
	        System.out.println("2. 스킬 추가");
	        System.out.println("3. 전체 스킬 보기");
	        System.out.println("4. 속성별 스킬 보기");
	        System.out.println("5. 종료");
	        System.out.print("메뉴 선택: ");
	        
            int menu = 0;
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.print("캐릭터 이름 입력: ");
                String name = sc.next();
                manager.addCharacter(name);

            } else if (menu == 2) {
                System.out.print("캐릭터 이름: ");
                String name = sc.next();
                System.out.print("스킬 이름: ");
                String skillName = sc.next();
                System.out.print("공격력: ");
                int power = sc.nextInt();
                sc.nextLine(); // 개행 제거
                System.out.print("속성 (예: 불, 물, 전기 등): ");
                String type = sc.next();
                manager.addSkill(name, skillName, power, type);

            } else if (menu == 3) {
                manager.printAllSkills();

            } else if (menu == 4) {
                System.out.print("캐릭터 이름: ");
                String name = sc.next();
                System.out.print("출력할 속성: ");
                String type = sc.next();
                manager.printSkillsByType(name, type);

            } else if (menu == 5) {
                System.out.println("종료합니다!");
                break;

            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }
	}
		
		
}

