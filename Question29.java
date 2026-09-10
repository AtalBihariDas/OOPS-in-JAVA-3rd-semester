class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
public class Question29 {
    public static void main(String[] args) {
        Person p = new Person("Rahul", 20);
        p.display();
    }
}
