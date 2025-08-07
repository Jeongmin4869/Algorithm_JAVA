import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int MOD = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N1; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int N2  = Integer.parseInt(br.readLine());
        int[] arr2 = new int[N2];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N2; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        long answer = 1;
        for(int i=0; i<N1; i++){
            int a = arr1[i];
            for(int j=0; j<N2; j++){
                int b = arr2[j];
                int g = gcd(Math.max(a,b), Math.min(a,b));
                answer *= g;
                if(answer >= MOD){
                    answer %= MOD;
                }
            }
        }
        
        System.out.println(answer);
    }

    public static int gcd(int a, int b){
        if(a%b==0) return b;
        return gcd(b, a%b);
    }
}
