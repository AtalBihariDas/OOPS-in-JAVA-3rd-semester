import java.io.File;
import java.util.Scanner;

public class Question58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File directory = new File(path);

        if (!directory.exists()) {
            System.out.println("Directory does not exist.");
        } else if (!directory.isDirectory()) {
            System.out.println("The given path is not a directory.");
        } else {
            File[] files = directory.listFiles();

            if (files == null || files.length == 0) {
                System.out.println("Directory is empty.");
            } else {
                System.out.println("Files and directories:");
                for (File file : files) {
                    if (file.isDirectory())
                        System.out.println("[DIR]  " + file.getName());
                    else
                        System.out.println("[FILE] " + file.getName());
                }
            }
        }

        sc.close();
    }
}
