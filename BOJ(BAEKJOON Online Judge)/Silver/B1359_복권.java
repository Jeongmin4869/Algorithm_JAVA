import java.util.*;
import java.io.*;

// 조합 (N개에서 M개를 뽑는 조함공식) :  nCm = N! / M!(N-M)!
class Main_B1359 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // N개에서 M개를 뽑는 경우의 수
        // nCm = N! / M!(N-M)!
        double total = combination(N, M);

        // 적어도 K개를 맞추는 경우의 합
        // 맞춘숫자 i개가 포함되면서 틀릿숫자m-i개가 포함되는 조함
        double min = 0;
        for(int i=K; i<=M; i++){
            if(i>N) break;
            min += combination(M, i) * combination(N-M, M-i);
        }
        
        
        System.out.println(min/total);
    }

    public static double combination(int n, int r){
        if(r>n) return 0;
        double result = 1;
        for(int i=0; i<r; i++){
            result *= (n-i);
            result /= (1+i);
        }
        return result;
    }
}
