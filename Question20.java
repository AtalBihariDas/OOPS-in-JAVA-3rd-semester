import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] a = new int[rows][columns];
        int[][] b = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                sum[i][j] = a[i][j] + b[i][j];

        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
