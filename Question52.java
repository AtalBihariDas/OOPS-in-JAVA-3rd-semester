import java.util.HashSet;
import java.util.TreeSet;

public class Question52 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");

        System.out.println("HashSet: " + hashSet);
        hashSet.remove("Banana");
        System.out.println("HashSet after removal: " + hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10);

        System.out.println("\nTreeSet: " + treeSet);
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
    }
}
