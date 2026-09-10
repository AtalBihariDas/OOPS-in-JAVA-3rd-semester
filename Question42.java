public class Question42 {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught.");
        } catch (Exception e) {
            System.out.println("General exception caught.");
        }
    }
}
