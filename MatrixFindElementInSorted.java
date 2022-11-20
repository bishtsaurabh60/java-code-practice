import java.text.BreakIterator;
import java.util.*;

public class MatrixFindElementInSorted {

    public static void main(final String[] args) {
     int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
    Find f = new Find();
      f.choose(mat);
    }
}

 class Find{
    public void displayOption(){
        System.out.println("Press 1 to Print Matrix Elements");
        System.out.println("Press 2 to Search Matrix Elements");
        System.out.println("Press 3 to Display Options");
        System.out.println("Press any key to quit");
    }

    public void MatrixData(int[][] mat)
    {
        System.out.println(".........Matrix.........");
        for (int i = 0; i < mat.length; i++){
        for (int j = 0; j < mat.length; j++){ 
            System.out.print(mat[i][j] + " ");
        }
        System.out.println("");
    }
    }

    public void choose(int[][] mat){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        displayOption();
        while(!quit){
            System.out.println("Enter Your Choice:");
            switch(sc.nextInt()){
                case 1:
                MatrixData(mat);
                break;
                case 2:
                System.out.print("Enter the Number which you want to Find = ");
                found(mat,sc.nextInt());
                break;
                case 3:
                displayOption();
                break;
                default:
                quit = true;
                break;
            }
        }
    }

    public int found(int[][] mat,int data){
        int i = 0;
    int j = mat.length-1;
    while( i < mat.length && j >= 0){
        if(mat[i][j] == data){
            System.out.println(data + " is found at "+i+","+j+" Position");
            return 1;
        }
        else if(mat[i][j] < data)
            i++;
        else
         j--;
  }
  System.out.println("Not Found");
  return 0;
}
}
