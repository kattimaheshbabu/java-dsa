import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to compute sum of 1..n: ");
        long n = sc.nextLong();
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Use formula n*(n+1)/2 for efficiency
            long sum = n * (n + 1) / 2;
            System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
        }
        sc.close();
    }
}
