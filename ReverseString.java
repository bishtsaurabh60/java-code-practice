import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseString {

    public static void reverseString(String arr) {

        int n = arr.length();
        String rev = "";
        for (int i = n - 1; i >= 0; i--) {
            rev = rev + arr.charAt(i);
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String arr = sc.next();
            reverseString(arr);
            t--;
        }

        sc.close();
    }
}