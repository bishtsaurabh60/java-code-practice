import java.util.*;
import java.math.*;

public class Array1 {
    public static Scanner sc = new Scanner(System.in);
    public static int arr[] = new int[sc.nextInt()];
    public static int size = arr.length;
    public static int count = 0;

    public static void insert(int data) {
        if (count < size) {
            arr[count] = data;
            count++;
        }
    }

    public static void insertAt(int data, int pos) {
        int index = pos - 1;
        if (count < size) {
            for (int i = count; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = data;
            count++;
        } else {
            System.out.println("Array is full");
        }
    }

    public static boolean search(int data) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                found = true;
                break;
            }
        }
        return found;
    }

    private static int findIndex(int data) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int delete(int data) {
        int index = findIndex(data);
        if (index != -1) {
            for (int i = index + 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            arr[size - 1] = 0;
            size--;
            return data;
        } else
            return -1;

    }

    public static void print(int ar[]) {
        System.out.println("Array:- " + Arrays.toString(ar));
    }

    public static void main(String[] arg) {
        System.out.println("Enter:- ");
        System.out.println("Insert Element:- ");

        insert(sc.nextInt());
        insert(sc.nextInt());
        insert(sc.nextInt());

        System.out.println("Insert Element at pos:- ");
        insertAt(sc.nextInt(), sc.nextInt());
        insertAt(sc.nextInt(), sc.nextInt());
        print(arr);
        System.out.println("Enter the element to be search:-");
        boolean search = search(sc.nextInt());
        if (search)
            System.out.println("Found");
        else
            System.out.println("Not Found");

        System.out.println("Enter the element to be deleted:-");
        int deleted = delete(sc.nextInt());
        if (deleted != -1)
            System.out.println(deleted + " is deleted from the array");
        else
            System.out.println(deleted + " element is not found in the given array");
        print(arr);
        sc.close();
    }
}
