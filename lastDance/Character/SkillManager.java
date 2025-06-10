package Character;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SkillManager {
    private HashMap<String, ArrayList<Skill>> skillMap = new HashMap<>();

    // 캐릭터 추가
    public void addCharacter(String name) {
        if (!skillMap.containsKey(name)) {
            skillMap.put(name, new ArrayList<>());
        } else {
            System.out.println("이미 존재하는 캐릭터입니다.");
        }
    }

    // 스킬 추가
    public void addSkill(String characterName, String skillName, int power, String type) {
        ArrayList<Skill> skills = skillMap.get(characterName);
        if (skills != null) {
            skills.add(new Skill(skillName, power, type));
        } else {
            System.out.println("캐릭터가 존재하지 않습니다.");
        }
    }

    // 전체 스킬 출력
    public void printAllSkills() {
        for (Map.Entry<String, ArrayList<Skill>> entry : skillMap.entrySet()) {
            String character = entry.getKey();
            ArrayList<Skill> skills = entry.getValue();
            for (Skill skill : skills) {
                System.out.println(character + " - " + skill.toString());
            }
        }
    }

    // 속성별 스킬 출력
    public void printSkillsByType(String characterName, String type) {
        ArrayList<Skill> skills = skillMap.get(characterName);
        if (skills != null) {
            for (Skill skill : skills) {
                if (skill.getType().equalsIgnoreCase(type)) {
                    System.out.println(characterName + " - " + skill.toString());
                }
            }
        } else {
            System.out.println("캐릭터가 존재하지 않습니다.");
        }
    }
}
