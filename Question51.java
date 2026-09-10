import java.util.HashMap;
import java.util.TreeMap;

public class Question51 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "C");
        hashMap.put(1, "A");
        hashMap.put(2, "B");

        System.out.println("HashMap: " + hashMap);
        System.out.println("Value for key 2: " + hashMap.get(2));

        hashMap.remove(1);
        System.out.println("HashMap after removal: " + hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");

        System.out.println("\nTreeMap: " + treeMap);
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());
    }
}
