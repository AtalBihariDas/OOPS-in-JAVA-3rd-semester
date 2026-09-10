abstract class Shape {
    abstract void area();
    void display() { System.out.println("This is a shape."); }
}
class Circle extends Shape {
    double radius = 5;
    @Override
    void area() {
        System.out.println("Area of circle = " + (Math.PI * radius * radius));
    }
}
public class Question35 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area();
    }
}
