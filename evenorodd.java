public class evenorodd {
        public static void main(String[] args) {
        int[] a = {10, 15, 22, 7, 30};
        int even = 0, odd = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                even++;
            else
                odd++;
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}