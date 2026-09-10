import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question59 {
    public static void main(String[] args) {
        String fileName = "buffered.txt";

        try {
            BufferedWriter writer =
                new BufferedWriter(new FileWriter(fileName));

            writer.write("Hello from BufferedWriter.");
            writer.newLine();
            writer.write("This is the second line.");
            writer.close();

            BufferedReader reader =
                new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("Contents of file:");

            while ((line = reader.readLine()) != null)
                System.out.println(line);

            reader.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
