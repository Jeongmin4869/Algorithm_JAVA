import java.util.*;
import java.util.stream.*;

public class Main_B9506 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int num = sc.nextInt();
 
            if(num == -1) break;
        
            int[] arr = IntStream.range(1, num).filter(val -> num%val == 0).toArray();
            if(IntStream.of(arr).sum() == num){
                System.out.print(num + " = ");
                for(int j=0; j<arr.length; j++){
                    System.out.print(arr[j]);
                    if(j != arr.length-1)  System.out.print(" + ");
                }
            }
            else {
                System.out.printf("%d is NOT perfect.", num);
            }
            System.out.println();
        }
        sc.close();
    }
}
