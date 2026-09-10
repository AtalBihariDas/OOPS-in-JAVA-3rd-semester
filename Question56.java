import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question56 {
    public static void main(String[] args) {
        try {
            FileOutputStream byteWriter = new FileOutputStream("byte.txt");
            byteWriter.write("Hello using byte stream.".getBytes());
            byteWriter.close();

            FileInputStream byteReader = new FileInputStream("byte.txt");
            System.out.println("Byte stream output:");
            int data;
            while ((data = byteReader.read()) != -1)
                System.out.print((char) data);
            byteReader.close();

            System.out.println("\n");

            FileWriter charWriter = new FileWriter("character.txt");
            charWriter.write("Hello using character stream.");
            charWriter.close();

            FileReader charReader = new FileReader("character.txt");
            System.out.println("Character stream output:");
            while ((data = charReader.read()) != -1)
                System.out.print((char) data);
            charReader.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
