import java.util.*;

class Main_B2293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[k+1];
        sc.nextLine();
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            for(int j=0; j<= k; j++){
                if(j-num>0) dp[j] = dp[j] + dp[j-num];
                else if(j-num == 0) dp[j]+=1;
            }
        }           
        System.out.println(dp[k]);
        sc.close();
    }
}
