import java.util.*;

public class MoveNeg {

    public static void neg(int[] arr, int n) {
        int ini = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[ini];
                arr[ini] = temp;
                ini++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { -1, -3, 3, -4, 21, 91, -67, 34, -100, 45, 65 };
        int n = arr.length;
        neg(arr, n);
        System.out.println(Arrays.toString(arr));
    }

}
