import java.util.*;
public class MatrixAddition{
    public static void main(String args[]){
 int[][] mat1 = {{4,2},{2,3}};
 int[][] mat2 = {{1,1},{2,2}};

 System.out.println("Matrix 1");
 for(int i = 0;i < mat1.length;i++){
    for(int j = 0;j < mat1.length;j++){
        System.out.print(mat1[i][j]+" ");
    }
    System.out.println(" ");
}

System.out.println("Matrix 2");
for(int i = 0;i < mat1.length;i++){
    for(int j = 0;j < mat1.length;j++){
        System.out.print(mat2[i][j]+" ");
    }
    System.out.println(" ");
}

 Add a = new Add();
 a.addition(mat1,mat2);
    }
}


class Add{
public void addition(int[][] mat1,int[][] mat2){
    int n = mat1.length;
    int m = mat2.length;
    int[][] mat3 = new int[n][m];
    System.out.println("Matrix Addition");
  for(int i = 0;i < n;i++){
      for(int j = 0;j < m;j++){
          mat3[i][j] = mat1[i][j] + mat2[i][j];
          System.out.print(mat3[i][j]+" ");
      }
      System.out.println(" ");
  }
}
}