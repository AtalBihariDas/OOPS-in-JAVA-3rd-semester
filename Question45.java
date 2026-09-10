public class Question45 {
    static void method1() { method2(); }
    static void method2() { method3(); }
    static void method3() {
        throw new ArithmeticException("Exception propagated to main.");
    }
    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}
