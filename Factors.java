import java.util.*;
import java.lang.*;
import java.io.*;

//Write a program to display all factors of a number.
public class Factors {
    public static void main(String[] args) throws java.lang.Exception {
        int n = 24;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(n);

        rootn(n);
    }

    public static void rootn(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
                if (i != Math.sqrt(n))
                    System.out.print(n / i + ", ");
            }

        }
        System.out.println(n);
    }
}
