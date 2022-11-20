import java.util.Arrays;

public class ReverseArr {
    public static int[] reverse(int[] ar) {
        int n = ar.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[n - i - 1];
            ar[n - i - 1] = temp;
        }
        return ar;
    }

    public static void main(String arg[]) {
        int arr[] = { 12, 32, 52, 62, 72 };
        int Rev[] = reverse(arr);
        System.out.println("The reverse array is " + Arrays.toString(Rev));
    }
}
