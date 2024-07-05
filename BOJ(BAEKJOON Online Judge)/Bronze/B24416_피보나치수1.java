import java.util.*;
import java.io.*;

class Main_B24416 {
    static long count1 = 0, count2 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo1(n);
        fibo2(n);
        System.out.println(count1+ " " + count2);

        br.close();
    }

    public static int fibo1(int n){
        
        if(n==1||n==2) {
            count1 += 1;
            return 1;
        }
        return fibo1(n-1)+fibo1(n-2);
    }

    public static int fibo2(int n){
        int[] fibonacci = new int[n+1];
        
        fibonacci[1] = fibonacci[2] = 1;
        for(int i=3; i<=n; i++){
            count2+=1;
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci[n];
    }
}
