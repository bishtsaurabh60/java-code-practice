import java.util.Scanner;

public class MatrixMultiplication{
    public static void main(String []ags){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Order of the Matrix1 = ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat1 = new int[m][n];
       
        System.out.println("Enter the elements of Matrix 1");
        for(int i = 0;i < m;i++){
           for(int j = 0;j < n;j++){
               mat1[i][j] = sc.nextInt();
           }
       }

       System.out.print("Enter the Order of the Matrix2 = ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] mat2 = new int[p][q];
        System.out.println("Enter the elements of Matrix 2");
        for(int i = 0;i < p;i++){
           for(int j = 0;j < q;j++){
               mat2[i][j] = sc.nextInt();
           }
       }

       System.out.println("Matrix 1");
       for(int i = 0;i < m;i++){
        for(int j = 0;j < n;j++){
            System.out.print(mat1[i][j]+" ");
        }
        System.out.println(" ");
    }

    System.out.println("Matrix 2");
       for(int i = 0;i < p;i++){
           for(int j = 0;j < q;j++){
               System.out.print(mat2[i][j]+" ");
           }
           System.out.println(" ");
       }
       
       Multiply mul = new Multiply();
       mul.multiply(mat1, mat2, m, q);
       sc.close();
    }
}

class Multiply{
    public void multiply(int[][] mat1,int[][] mat2,int m,int q){
      int[][] multi = new int[m][q];
      System.out.println("Matrix Multiply");
     for(int i = 0;i< m;i++){
     for(int j = 0;j< q;j++){
         for(int k = 0;k<multi.length;k++){
             multi[i][j] += mat1[i][k] * mat2[k][j];
         }
         System.out.print(multi[i][j]+" ");
        }
        System.out.println(" ");
     }
    }
}