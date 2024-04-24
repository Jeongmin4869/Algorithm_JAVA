import java.util.*;

public class Main_B1978 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr1[] = new int[N];
        int max = 0, answer = 0;
        for(int i=0; i<N; i++){
            arr1[i] = sc.nextInt();
            if(max<arr1[i]) max = arr1[i];
        }
        
        int arr2[] = new int[max+1];
        for(int i=2; i<=max; i++){
            if(arr2[i] == 0){
                for(int j=2; j*i<=max; j++){
                    arr2[i*j] = 1;        
                }
            }
        }
        
        for(int i=0; i<arr1.length; i++){
            if(arr2[arr1[i]] == 0 && arr1[i] != 1) answer += 1;
        }
        
        System.out.println(answer);
        
        sc.close();
    }
}
