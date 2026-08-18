import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] a = {50, 10, 40, 20, 30};

        Arrays.sort(a);

        System.out.println("Sorted Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
