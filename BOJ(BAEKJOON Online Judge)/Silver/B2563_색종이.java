import java.util.*;
public class Main_B2563 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[100][100];
        int sum = 0;
        int count = sc.nextInt();
        for(int i=0; i<count; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            for (int j = N; j < N + 10; j++) {
                for(int k = M; k<M +10; k++ ){
                    arr[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for(int j = 0; j<100; j++ ){
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
