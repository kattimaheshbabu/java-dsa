public class Fibonacci {
    public static void main(String[] args) {
        int count = 10;
        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + count + " terms:");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
}
