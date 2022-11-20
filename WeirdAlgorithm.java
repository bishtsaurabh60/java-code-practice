import java.util.*;
public class WeirdAlgorithm {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
       //System.out.println(n+" ");
        while(n > 0){
         System.out.println(n+" ");
             if(n==1)
                 break;
            if(n % 2 == 0)
                n = n/2;
                else
                n = n * 3 + 1;
                
        }
    }
}
