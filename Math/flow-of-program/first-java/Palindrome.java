public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int originalNum = num;
        int reversed = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        // Check if the number is palindrome
        if (reversed == originalNum) {
            System.out.println(originalNum + " is a Palindrome number");
        } else {
            System.out.println(originalNum + " is not a Palindrome number");
        }
    }
}
