import java.util.*;
import java.util.stream.*;

public class Main_B2587 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int temp;

        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        
        selection(arr);
        System.out.println(IntStream.of(arr).sum()/5);
        System.out.println(arr[2]);
        sc.close();
    }
    
    public static void insertion(int[] arr){
        int j;
        for(int i=1; i<5; i++){
            int now = arr[i];
            for(j=i-1; j>=0; j--){
                if(arr[j]>= now) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = now;
        }
    }
    
    public static void buble(int[] arr){
        int temp;
        for(int i=0; i<4; i++){
            for(int j=i+1; j<5; j++){
                if(arr[j]<arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    
    public static void selection(int[] arr){
        int temp, idx;
        for(int i=0; i<4; i++){
            idx = i;
            for(int j=i+1; j<5; j++){
                if(arr[idx]>arr[j]) idx = j;
            }
            temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }   
}
