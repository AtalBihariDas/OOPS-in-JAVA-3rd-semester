import java.util.ArrayList;
import java.util.LinkedList;

public class Question50 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("First element: " + arrayList.get(0));

        arrayList.remove("Banana");
        System.out.println("After removal: " + arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.addFirst("Blue");
        linkedList.addLast("Yellow");

        System.out.println("\nLinkedList: " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removals: " + linkedList);
    }
}
