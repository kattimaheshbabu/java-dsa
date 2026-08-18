public class Updation {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;
        int newValue = 35;

        arr[index] = newValue;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
