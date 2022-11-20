//Given an number n. Find the number of occurrences of n in the array.

public class Occurrence {

    public static int occur(int[] arr, int n, int check) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == check) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 3, 5, 3, 4, 5, 3 };
        int n = arr.length;
        int check = 3;

        int occurs = occur(arr, n, check);
        System.out.println(occurs);
    }
}
