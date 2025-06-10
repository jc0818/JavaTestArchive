// Entry 클래스: 키-값 저장용
class Entry<K, V> {
    K key;
    V value;

    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

// 직접 만든 HashMap 흉내 클래스
class MyMap<K, V> {
    private ArrayList<Entry<K, V>> list;

    public MyMap() {
        list = new ArrayList<>();
    }

    // put: 키가 이미 있으면 값 수정, 없으면 추가
    public void put(K key, V value) {
        for (Entry<K, V> e : list) {
            if (e.key.equals(key)) {
                e.value = value;
                return;
            }
        }
        list.add(new Entry<>(key, value));
    }

    // get: 키로부터 값 찾기
    public V get(K key) {
        for (Entry<K, V> e : list) {
            if (e.key.equals(key)) {
                return e.value;
            }
        }
        return null;
    }

    // 키 목록 출력 (이터레이터 느낌)
    public void printAll() {
        for (Entry<K, V> e : list) {
            System.out.println(e.key + " : " + e.value);
        }
    }
}

// 테스트용 메인 클래스
public class Main {
    public static void main(String[] args) {
        MyMap<String, String> map = new MyMap<>();

        map.put("Tiger", "호랑이");
        map.put("Lion", "사자");
        map.put("Tiger", "한국 호랑이");  // 값 수정됨

        System.out.println("Tiger = " + map.get("Tiger"));
        System.out.println("Lion = " + map.get("Lion"));
        System.out.println("Zebra = " + map.get("Zebra")); // null

        System.out.println("\n전체 출력:");
        map.printAll();
    }
}
