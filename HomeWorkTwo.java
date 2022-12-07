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
    taskFive(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    taskSix();
    taskSeven();
    taskSevenPartTwo();
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

  private static void taskFive(int[] value) {
    int min = value[0];
    int max = value[0];
    for (int i : value) {
      if (min < i) {
        min = i;
      } else if (max > i) {
        max = i;
      }
    }
    System.out.println(max + "\n" + min);
  }

  private static boolean taskSix() {
    boolean flag = false;
    int[] a = {3, 3, 3, 3, 6, 6};
    var left = 0;
    var b = a.length;
    for (int i = 0; i < b; i++) {
      left += a[i];
      int right = 0;
      for (int j = 0; j < b; j++) {
        right += (j > i) ? a[j] : 0;
      }
      if (left == right) {
        System.out.println("Check = " + left + " Check = " + right);
        System.out.println(true);
        flag = true;
      }
    }
    return flag;
  }

  private static void taskSeven() {
    Integer[] numbers = {1, 3, 5, 7, 9, 12};
    var n = -2;
    System.out.println("MyMethod : " + Arrays.toString(numbers));
    List<Integer> list = Arrays.asList(numbers);
    Collections.rotate(list, n);
    System.out.println("rotate : " + list);
  }

  private static void taskSevenPartTwo() {
    int[] mass = {1, 2, 3, 4, 5, 6};
    var n = -4;
    for (int i = 0; i > n; i--) {
      int lastEl = mass[0];
      for (int j = 1; j < mass.length; j++) {
        mass[j - 1] = mass[j];
      }
      mass[mass.length - 1] = lastEl;
    }
    for (int j : mass) {
      System.out.print(j + " ");
    }
  }
}





