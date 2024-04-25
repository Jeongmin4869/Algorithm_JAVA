import java.util.*;

public class Main_B2581 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = Math.max(A,B);
        int arr[] = new int[N+1];
        int sum = 0, min = 10000;
        
        for(int i=2; i<=N; i++){
            if(arr[i] == 0){
                for(int j=2; j*i<=N; j++){
                    arr[i*j] = 1;
                }
            }
        }
        
        for(int i=A; i<=B; i++){
            if(arr[i] == 0 && i != 1){
                sum += i;
                min = Math.min(i, min);
            }
        }
        
        if(sum == 0){
            System.out.println(-1);
        }
        else {
            System.out.println(sum + "\n" + min);
        }
        
        sc.close();
    }
}
