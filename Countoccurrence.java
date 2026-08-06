public class Countoccurrence {
    public static void main(String[] args) {
        int[] a = {10, 10, 10, 30, 10};
        int key = 10, count = 0;

        for (int i = 0; i < a.length; i++)
            if (a[i] == key)
                count++;

        System.out.println("Occurrences = " + count);
    }
}