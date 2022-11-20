// Write a program to sort the array?
// input : - [-1,0,3,57,89,9]
// outPut : - [-1,0,3,9,57,89]

import java.util.*;
import java.math.*;

public class Sorting {

    // 1. Bubble Sort
    public static int[] bubble(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }

            if (!flag)
                break;

        }
        return arr;
    }

    // 2. Selection Sort
    public static int[] selection(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    // 3. Insertion Sort
    public static int[] insertion(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int temp = arr[i]; // assign the current array val to the temporary var
            int hole = i; // assign the current index to the hole var

            // iterate loop until hole becomes 0 as well as if temp smaller than arr[hole-1]
            while (hole > 0 && temp < arr[hole - 1]) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = temp; // assign temp to the new place after
        }

        return arr;
    }

    // 4. Merge Sort
    public static int[] mergeSort(int arr[], int l, int r) {

        if (arr.length < 2)
            return arr;
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

        return arr;
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int nL = m - l + 1;
        int nR = r - m;

        int[] L = new int[nL];
        int[] R = new int[nR];

        for (int i = 0; i < nL; ++i) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < nR; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < nL) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < nR) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // 5.Quick Sort
    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int partIn = low;

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[partIn];
                arr[partIn] = temp;

                partIn++;
            }
        }

        int temp = arr[high];
        arr[high] = arr[partIn];
        arr[partIn] = temp;
        return partIn;
    }

    // 6. Heap Sort
    public static int[] heapSort(int[] arr, int l, int r) {

        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);

        }
        return arr;
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, -1, -3, 3, 89, 59, 9 };
        int n = arr.length;
        System.out.println("Original Array is :- " + Arrays.toString(arr));

        int[] Barr = bubble(arr);
        System.out.println("Bubble Sorted Array is :- " + Arrays.toString(Barr));

        int[] SArr = selection(arr);
        System.out.println("Selection Sorted Array is :- " + Arrays.toString(SArr));

        int[] InArr = insertion(arr);
        System.out.println("Insertion Sorted Array is :- " + Arrays.toString(InArr));

        int[] merSort = mergeSort(arr, 0, n - 1);
        System.out.println("Merge Sort :- " + Arrays.toString(merSort));

        int[] quickSort = quickSort(arr, 0, n - 1);
        System.out.println("Quick Sort :- " + Arrays.toString(quickSort));

        int[] heapSort = heapSort(arr, 0, n - 1);
        System.out.println("Heap Sort :- " + Arrays.toString(heapSort));
    }
}