import java.util.*;
import java.lang.*;
import java.io.*;

// 식의 계산은 연산자 우선 순위를 무시하고 앞에서부터 진행
class Main_B14888 {

    static long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
    static int N ;
    static int[] arr;
    static int[] sign;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        sign = new int[4];
        
        StringTokenizer st  = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st  = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            sign[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, arr[0]);

        System.out.println(max);
        System.out.println(min);

        br.close();

    }

    public static void dfs(int now, long sum){

        if(now == N){
            min = Math.min(min, sum);
            max = Math.max(max, sum);
            return;
        }

        for(int j=0; j<4; j++){
            long s = 0;
            if(sign[j] > 0){
                sign[j] -= 1;
                switch (j) {
                    case 0:
                        s = sum + arr[now];
                        break;
                    case 1:
                        s = sum - arr[now];
                        break;
                    case 2:
                        s = sum * arr[now];
                        break;
                    case 3:
                        s = sum / arr[now];
                        break;
                }
                dfs(now+1, s);
                sign[j] += 1;
            }
        }        
    }
}
