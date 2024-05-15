import java.util.*;
import java.util.stream.*;

public class Main_B25305 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int maxCount = sc.nextInt();
        int temp;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        selection(arr, N);

        System.out.println(arr[maxCount-1]);

        sc.close();
    }
    
    private static void insertion(int[] arr, int N){
        int now, j;
        for(int i=1; i<N; i++){
            now = arr[i];
            for(j=i-1; j>=0; j--){
                if(now > arr[j]) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = now;
        }
    }
    
    private static void buble(int[] arr, int N){
        int temp;
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(arr[j-1] < arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    private static void selection(int[] arr, int N){
        int temp, index;
        for(int i=0; i<N-1; i++){
            index = i;
            for(int j=i+1; j<N; j++){
                if(arr[index] < arr[j]) index = j;
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        
    }
    
}
