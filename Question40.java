class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}
class Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    @Override
    void sound() { System.out.println("Dog barks"); }
}
public class Question40 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Compile-time polymorphism:");
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10.5, 20.5));

        System.out.println("\nRuntime polymorphism:");
        Animal a = new Dog();
        a.sound();
    }
}
