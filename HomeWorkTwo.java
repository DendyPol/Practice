package Practice;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWorkTwo {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        System.out.println(checkBalance(new int[]{3, 3, 3, 3, 6, 6}));
        taskSeven(new Integer[]{1, 3, 5, 7, 9, 12});
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

    private static void taskThree() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int b = a.length;

        for (int i = 0; i < b; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
                System.out.println(a[i]);
            }
        }
    }

    private static void taskFour() {
        int[][] a = new int[5][5];
        int b = a.length;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (j - i == 0)
                    a[i][j] = 1;
                else if (j + i == 4) {
                    a[i][j] = 1;
                }
                System.out.print("-" + a[i][j] + "-");
            }
            System.out.println();
        }
    }


    private static void taskFive() {
        int[] a = {9, 12, -121, 18, 7, 121};
        int b = a.length;
        int max = 0;
        int min = 0;

        for (int i = 0; i < b; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (max < a[i]) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("min = " + min + "\n" + "max = " + max);
    }

    private static boolean checkBalance(int[] a) {
        int left = 0;
        int b = a.length;

        for (int i = 0; i < b; i++) {
            left += a[i];
            int right = 0;
            for (int j = 0; j < b; j++) {
                right += (j > i) ? a[j] : 0;
            }
            if (left == right) {
                System.out.println("Check = " + left + " Check = " + right);
                return true;
            }
        }
        return false;
    }

    private static void taskSeven(Integer[] numbers) {
        int n = -2;
        System.out.println("MyMethod : " + Arrays.toString(numbers));

        List<Integer> list = Arrays.asList(numbers);
        Collections.rotate(list, n);
        System.out.println("rotate : " + list);


    }
}


