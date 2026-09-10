import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.marks, s1.marks);
    }
}

public class Question54 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rahul", 80));
        students.add(new Student("Amit", 90));
        students.add(new Student("Priya", 85));

        System.out.println("Using Comparable (sort by name):");
        Collections.sort(students);
        for (Student s : students) System.out.println(s);

        System.out.println("\nUsing Comparator (sort by marks descending):");
        Collections.sort(students, new MarksComparator());
        for (Student s : students) System.out.println(s);
    }
}
