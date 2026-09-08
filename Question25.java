import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int characters = str.length();
        int words = 0;

        String trimmed = str.trim();

        if (!trimmed.isEmpty()) {
            words = trimmed.split("\\s+").length;
        }

        System.out.println("Number of characters = " + characters);
        System.out.println("Number of words = " + words);

        sc.close();
    }
}
