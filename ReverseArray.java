// Write a program to reverse the array?
// input : - [1,2,3,4,5]
// outPut : - [5,4,3,2,1]

import java.util.*;
import java.math.*;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        System.out.println("Original Array is :- " + Arrays.toString(arr));

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println("Reversed Array is :- " + Arrays.toString(arr));
    }
}