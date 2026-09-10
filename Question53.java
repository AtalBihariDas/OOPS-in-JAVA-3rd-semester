import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Question53 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("\nUsing ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext())
            System.out.println(listIterator.next());

        System.out.println("\nListIterator in reverse:");
        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous());
    }
}
