import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print table for: ");
        int n = sc.nextInt();
        System.out.print("Enter limit (e.g., 10): ");
        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }

        sc.close();
    }
}
