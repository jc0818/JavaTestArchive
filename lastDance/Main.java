import model.Animal;
import servicee.AnimalDictionary;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalDictionary ad = new AnimalDictionary();

        ad.addAnimal(new Animal("호랑이", "포유류", "육식 동물"));
        ad.addAnimal(new Animal("펭귄", "조류", "남극에 사는 새"));
        ad.addAnimal(new Animal("사자", "포유류", "사바나의 왕"));

        System.out.println("=== '포유류' 검색 결과 ===");
        List<Animal> mammals = ad.searchByType("포유류");
        for (Animal a : mammals) {
            System.out.println(a);  // Animal 클래스에 toString() 구현돼 있어야 예쁘게 나와
        }

        System.out.println("\n=== 이름으로 검색: '펭귄' ===");
        String result = ad.searchAnimal("펭귄");
        System.out.println(result);
    }
}
