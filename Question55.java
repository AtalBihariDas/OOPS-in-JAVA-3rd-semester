import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question55 {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello! This is a Java file handling example.\n");
            writer.write("This file is written using FileWriter.");
            writer.close();

            FileReader reader = new FileReader(fileName);
            int character;

            System.out.println("Contents of file:");
            while ((character = reader.read()) != -1)
                System.out.print((char) character);

            reader.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
