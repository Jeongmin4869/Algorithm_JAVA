/*
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static Nums nums;

    static class Nums{
        int zero;
        int one;
        public void Nums(){
            zero = 0;
            one = 0;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++){
            nums = new Nums();
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            sb.append(nums.zero + " " + nums.one).append("\n");
        }
        System.out.print(sb);
        
    }

    public static int fibonacci(int n){
        if(n==0){
            nums.zero += 1;
            return 0;
        }
        else if (n==1){
            nums.one += 1;
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }
    
}

*/

import java.util.*;
import java.io.*;

class Main_B1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        int[][] dp = new int[41][2];
        dp[0][0] = 1;
        dp[1][1] = 1;
        for(int i=2; i<=40; i++){
            dp[i][0] = dp[i-2][0] + dp[i-1][0];
            dp[i][1] = dp[i-2][1] + dp[i-1][1];
        }
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n][0] + " " + dp[n][1]).append("\n");
        }
        System.out.print(sb);
        
    }
}
