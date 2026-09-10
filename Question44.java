import java.io.FileReader;
import java.io.IOException;

public class Question44 {
    static void checkedException() {
        try {
            FileReader file = new FileReader("example.txt");
            file.close();
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println("Checked exception: " + e.getMessage());
        }
    }

    static void uncheckedException() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        checkedException();
        uncheckedException();
    }
}
