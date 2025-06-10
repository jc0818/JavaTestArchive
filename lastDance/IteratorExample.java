import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("딸기");
        fruits.add("포도");

        Iterator<String> it = fruits.iterator();

        System.out.println("=== Iterator를 이용한 과일 출력 ===");
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);
        }
    }
}
/*
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("철수");
        names.add("영희");
        names.add("민수");
        names.add("영희");

        Iterator<String> it = names.iterator();

        // "영희" 제거하기
        while (it.hasNext()) {
            if (it.next().equals("영희")) {
                it.remove();  // Iterator의 remove() 사용!
            }
        }

        System.out.println("=== '영희' 제거 후 출력 ===");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

*/