import java.util.Scanner;

public class LcmAndHcf {
    // Computes GCD using Euclidean algorithm
    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        long a = sc.nextLong();
        System.out.print("Enter second number: ");
        long b = sc.nextLong();

        long hcf = gcd(a, b);
        long lcm = (a / hcf) * b; // avoids overflow slightly

        System.out.println("HCF (GCD) = " + hcf);
        System.out.println("LCM = " + Math.abs(lcm));

        sc.close();
    }
}
