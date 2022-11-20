import java.util.Arrays;

//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm.

public class SortOut {
    public static void sortIn(int[] arr, int n) {

        int i = 0;
        int l = n - 1;
        int in = 0;
        while (in <= l) {
            switch (arr[in]) {
                case 0: {
                    int temp = arr[i];
                    arr[i] = arr[in];
                    arr[in] = temp;
                    i++;
                    in++;
                    break;
                }
                case 1: {
                    in++;
                    break;
                }
                case 2: {
                    int temp = arr[in];
                    arr[in] = arr[l];
                    arr[l] = temp;
                    l--;
                    break;
                }

                default:
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 1, 1, 0, 0, 2, 2 };
        int n = arr.length;
        sortIn(arr, n);
        System.out.println("new Array = " + Arrays.toString(arr));
    }
}
