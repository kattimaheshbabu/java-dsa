public class alernate01 {
    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i % 2;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
