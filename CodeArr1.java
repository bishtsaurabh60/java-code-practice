import java.util.*;

public class CodeArr1 {
    private int arr[];
    private int size;

    public CodeArr1(int[] ar, int size) {
        this.arr = ar;
        this.size = size;
    }

    public boolean search(int el) {
        boolean found = false;
        for (int i = 0; i < this.size; i++) {
            if (arr[i] == el) {
                found = true;
            }
        }
        return found;
    }

    public static void main(String ars[]) {
        int a[] = { 13, 5, 15, 2, 4, 3 };
        int sizes = a.length;
        int check = 3;
        CodeArr1 ca = new CodeArr1(a, sizes);
        boolean found = ca.search(check);
        System.out.println("the searched element is = " + check + ", is this element got found = " + found);

    }
}