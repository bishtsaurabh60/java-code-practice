//Find the range of the array. Range means the difference between the maximum and minimum element in the array.

import java.util.*;

public class RangeEle {

    public static void ranges(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int dif = max - min;
        System.out.println("Min = " + min + " Max = " + max + " Range  = " + dif);
    }

    public static void main(String[] args) {
        int[] arr = { -1, -3, 3, 47, 21, 91 };
        int n = arr.length;
        ranges(arr, n);
    }
}
