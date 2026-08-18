public class Insertion {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int[] original = {10, 20, 30, 40, 50};

        for (int i = 0; i < original.length; i++) {
            arr[i] = original[i];
        }

        // Insert 35 at index 3
        int element = 35;
        int index = 3;

        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
