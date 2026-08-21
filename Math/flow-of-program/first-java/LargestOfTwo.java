public class LargestOfTwo {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 50;

        // Find the largest of two numbers
        if (num1 > num2) {
            System.out.println(num1 + " is the largest number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest number");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
