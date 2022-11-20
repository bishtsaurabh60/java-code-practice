import java.util.*;

public class Sort {
    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int pi = l - 1;

        for (int i = l; i < r; i++) {

            if (arr[i] < pivot) {
                pi++;
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
            }
        }

        int temp = arr[pi + 1];
        arr[pi + 1] = arr[r];
        arr[r] = temp;

        return pi + 1;
    }

    public static int[] sorts(int[] ar, int l, int r) {
        if (l < r) {
            int pi = partition(ar, l, r);
            sorts(ar, l, pi - 1);
            sorts(ar, pi + 1, r);
        }
        return ar;
    }

    public static void main(String args[]) {
        int[] arr = { -1, 0, 3, 57, 89, 9 };
        int n = arr.length;
        System.out.println("UnSorted = " + Arrays.toString(arr));
        int[] sorted = sorts(arr, 0, n - 1);
        System.out.println("Sorted = " + Arrays.toString(sorted));
    }
}
