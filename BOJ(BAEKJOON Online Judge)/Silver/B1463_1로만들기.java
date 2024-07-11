import java.util.*;

class Main_B1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        for(int i=2; i<=N; i++){
            arr[i] = arr[i-1]+1;
            if(i%2==0)
                arr[i] = Math.min(arr[i], arr[i/2]+1);
            if(i%3==0)
                arr[i] = Math.min(arr[i], arr[i/3]+1);
        }
        System.out.println(arr[N]);
    }
} 
