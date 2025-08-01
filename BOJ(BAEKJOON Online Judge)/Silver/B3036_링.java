import java.util.*;
import java.io.*;

class Main_B3036 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());            
        }

        int K = num[0];
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<N; i++){
            int G = gcd(Math.max(K, num[i]), Math.min(K, num[i]));
            sb.append(K/G + "/" + num[i]/G).append("\n");
        }
        System.out.print(sb);        
    }

    static int gcd(int a, int b){
        if(a%b == 0) return b;
        return gcd(b, a%b);
    }

}
