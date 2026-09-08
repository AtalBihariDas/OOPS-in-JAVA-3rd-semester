import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Original string: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        StringBuilder sb = new StringBuilder(str);

        System.out.println("StringBuilder: " + sb);

        sb.append(" Java");
        System.out.println("After append: " + sb);

        sb.insert(0, "Hello ");
        System.out.println("After insert: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sc.close();
    }
}
