import java.util.ArrayList;

public class FrndsArrayList {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add("Alice");
        friends.add("Bob");
        friends.add("Charlie");

        System.out.println("Friends: " + friends);

        friends.remove(1);

        System.out.println("After removal: " + friends);
    }
}
