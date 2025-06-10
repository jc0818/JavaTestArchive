// ======= 패키지 흉내 =======
package example;

// ======= 인터페이스 =======
interface Printable {
    void print();
}

// ======= 제네릭 클래스 =======
class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

// ======= 부모 클래스 =======
class Animal {
    public void sound() {
        System.out.println("동물이 소리낸다.");
    }
}

// ======= 자식 클래스 =======
class Dog extends Animal implements Printable {
    // 오버라이딩
    public void sound() {
        System.out.println("멍멍!");
    }

    // 오버로딩
    public void sound(String name) {
        System.out.println(name + "가 멍멍!");
    }

    @Override
    public void print() {
        System.out.println("나는 프린트 가능한 개입니다.");
    }
}

public class Main {
    public static void main(String[] args) {

        // ✅ 업캐스팅 & 다형성
        Animal a = new Dog();
        a.sound();  // 멍멍!

        // ✅ 다운캐스팅
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.sound("뽀삐");
        }

        // ✅ 인터페이스 사용
        Printable p = new Dog();
        p.print();

        // ✅ 제네릭 클래스
        Box<String> strBox = new Box<>();
        strBox.set("제네릭입니다");
        System.out.println(strBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());

        // ✅ ArrayList 사용 (컬렉션)
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");

        // ✅ 이터레이터로 ArrayList 순회
        System.out.println("== ArrayList 출력 (Iterator) ==");
        Iterator<String> it1 = fruits.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        // ✅ HashMap + Set + Iterator 사용
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Tiger", "호랑이");
        dictionary.put("Lion", "사자");

        // Set으로 key 접근
        Set<String> keys = dictionary.keySet();

        // 이터레이터로 순회
        System.out.println("== HashMap Key Set 출력 (Iterator) ==");
        Iterator<String> it2 = keys.iterator();
        while (it2.hasNext()) {
            String key = it2.next();
            String value = dictionary.get(key);
            System.out.println(key + " : " + value);
        }

        // ✅ 다형성 + 오버라이딩 + 오버로딩 완성
        Animal animal = new Dog();  // 업캐스팅
        animal.sound();             // 멍멍!
    }
}
