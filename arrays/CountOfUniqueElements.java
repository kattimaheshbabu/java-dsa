import java.util.HashSet;

public class CountOfUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        HashSet<Integer> unique = new HashSet<>();

        for (int num : arr) {
            unique.add(num);
        }

        System.out.println("Count of unique elements: " + unique.size());
        System.out.println("Unique elements: " + unique);
    }
}
