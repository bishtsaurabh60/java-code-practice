import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pattern1 {
    public static void main(String[] args) throws java.lang.Exception {
        int n = 4;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            int space = 2 * n - 2 * i;

            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            int space = 2 * n - 2 * i;

            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}