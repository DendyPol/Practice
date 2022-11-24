package Practice;

public class HomeWorkTwo {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    private static void taskOne() {
        int[] a = {0, 1, 0, 1, 1, 1, 0, 0, 0};
        int b = a.length;
        for (int i = 0; i < b; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else a[i] = 0;
            System.out.println(a[i]);
        }
    }

    private static void taskTwo() {
        int[] b = new int[8];
        int l = b.length;
        int k = 0;

        for (int i = 0; i < l; i++, k = k + 3) {
            b[i] = k;

            System.out.println(b[i]);
        }
    }
}

