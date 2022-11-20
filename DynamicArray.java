import java.util.*;
import java.math.*;
import java.io.*;

public class DynamicArray {
    public static Scanner sc = new Scanner(System.in);
    private int[] arr;
    private int capacity;
    private int current;

    public DynamicArray() {
        arr = new int[6];
        current = 0;
        capacity = 6;
    }

    public int getSize() {
        return current;
    }

    public int getCapacity() {
        return capacity;
    }

    public int search(int data) {
        int i;
        for (i = 0; i < current; i++) {
            if (arr[i] == data) {
                break;
            }
        }
        return arr[i];
    }

    private void resize() {
        int[] temp = new int[2 * capacity];

        for (int i = 0; i < capacity; i++)
            temp[i] = arr[i];
        capacity *= 2;
        arr = temp;
    }

    public void insert(int data) {
        if (current == capacity) {
            resize();
        }
        arr[current] = data;
        current++;
    }

    public void insertAt(int data, int pos) {
        int index = pos - 1;
        if (current == capacity) {
            resize();
        }

        for (int i = current - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = data;
        current++;
    }

    public void update(int data, int pos) {
        int index = pos - 1;
        if (index == capacity)
            insert(data);
        else
            arr[index] = data;
    }

    public void delete(int x) {
        int index = -1;
        for (int i = 0; i < capacity; i++) {
            if (x == arr[i])
                index = i;
        }
        for (int i = index; i < capacity - 1; i++) {
            arr[i] = arr[i + 1];
        }
        current--;
    }

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        System.out.println("current = " + da.getSize() + " capacity = " + da.getCapacity());

        // System.out.println("Insert an item:-");
        da.insert(55);
        da.insert(34);
        da.insert(51);
        da.insert(65);
        da.insert(24);
        da.insert(12);
        da.insert(64);
        da.insert(314);
        da.insert(11);

        System.out.println("After Insertion at the end :- " + Arrays.toString(da.arr));

        da.insertAt(117, 3);
        da.insertAt(85, 1);
        da.insertAt(13, 4);
        da.insertAt(94, 7);

        System.out.println("After Insertion at any Position :- " + Arrays.toString(da.arr));

        da.delete(24);
        da.delete(65);
        da.delete(11);

        System.out.println("After Deletion :- " + Arrays.toString(da.arr));

        da.update(31, 2);
        da.update(45, 5);

        System.out.println("After Updating :- " + Arrays.toString(da.arr));

        System.out.println("current = " + da.getSize() + " capacity = " + da.getCapacity());

        System.out.print("Search an item:-");

        int el = sc.nextInt();
        if (el == da.search(el))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        sc.close();

    }
}