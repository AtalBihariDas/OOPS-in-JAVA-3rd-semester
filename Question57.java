import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question57 {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try {
            FileInputStream input = new FileInputStream(sourceFile);
            FileOutputStream output = new FileOutputStream(destinationFile);

            int data;
            while ((data = input.read()) != -1)
                output.write(data);

            input.close();
            output.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
