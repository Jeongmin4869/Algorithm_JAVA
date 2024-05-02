import java.util.*;

public class Main_B2798 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        
        int num = 0;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum <= max) num = Math.max(num, sum);
                }
            }
        }
        
        System.out.println(num);
        
        sc.close();
    }
}
