class Student {
    static String college = "ABC College";
    int rollNo;
    Student(int rollNo) { this.rollNo = rollNo; }
    void display() {
        System.out.println("College: " + college);
        System.out.println("Roll No: " + rollNo);
    }
}
public class Question38 {
    public static void main(String[] args) {
        Student s1 = new Student(101);
        Student s2 = new Student(102);
        s1.display();
        s2.display();
        Student.college = "XYZ College";
        System.out.println("\nAfter changing static member:");
        s1.display();
        s2.display();
    }
}
