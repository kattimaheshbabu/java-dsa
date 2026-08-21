public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sum = 0;
        int digits = 0;

        // Count the number of digits
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate the sum of digits raised to the power of digit count
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check if the number is Armstrong number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
        }
    }
}
