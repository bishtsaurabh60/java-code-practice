import java.util.*;

// Find the Kth largest and Kth smallest number in an array.

public class Kth {

    private static int[] sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int nl = m - l + 1; // size of left array
        int nr = r - m; // size of right array

        // created new arrays to store left and right side
        int[] L = new int[nl];
        int[] R = new int[nr];

        for (int i = 0; i < nl; i++) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < nr; j++) {
            R[j] = arr[j + m + 1];
        }

        int i = 0, j = 0;
        int k = l; // for arr

        while (i < nl && j < nr) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // for remaining elements
        while (i < nl) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < nr) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void kthLandR(int[] arr, int n, int k) {
        sort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            if (k == i) {
                System.out.println(k + "th Smallest " + arr[i - 1]);
            }
            if (n - k == i) {
                System.out.println(k + "th Largest " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 32, 13, 44, 15, 9, 6, 33, 19 };
        int n = arr.length;
        int k = 3;
        kthLandR(arr, n, k);
    }
}
