import java.util.ArrayList;

public class Update3rdValueinArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Before: " + numbers);

        numbers.set(2, 35);

        System.out.println("After: " + numbers);
    }
}
