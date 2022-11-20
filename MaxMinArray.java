import java.util.*;
import java.math.*;

public class MaxMinArray {

    public static int max(int ar[]) {
        int n = ar.length;
        int maxNo = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (ar[i] > maxNo)
                maxNo = ar[i];
        }
        return maxNo;
    }

    public static int min(int ar[]) {
        int n = ar.length;
        int minNo = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (ar[i] < minNo)
                minNo = ar[i];
        }
        return minNo;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 4, 52, 14, 17 };
        System.out.println("Array is :- " + Arrays.toString(arr));
        int max = max(arr);
        System.out.println("Max no is :- " + max);
        int min = min(arr);
        System.out.println("Min no is :- " + min);
    }
}