import java.util.Arrays;
import java.util.Collections;

public class SortingandReverseSorting {
    public static void main(String[] args) {
        Integer[] a = {50, 10, 40, 20, 30};

        Arrays.sort(a);
        System.out.println("Ascending: " + Arrays.toString(a));

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(a));
    }
}
