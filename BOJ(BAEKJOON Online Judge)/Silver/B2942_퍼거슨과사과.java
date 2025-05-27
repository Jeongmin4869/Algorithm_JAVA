import java.util.*;
import java.io.*;

class Main_B2942 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long G = Long.parseLong(st.nextToken());
        long R = Long.parseLong(st.nextToken());

        long N = gcd(Math.max(G,R), Math.min(G,R));
        StringBuilder sb = new StringBuilder();
        for(long i=1; i<=N; i++){
            if(G%i==0 && R%i==0){
                sb.append(i + " " + G/i + " " + R/i).append("\n");
            }
        }        
        System.out.println(sb);
    }

    public static long gcd(long a, long b){
        if(a%b==0) return b;
        return gcd(b, a%b);
    }
}
