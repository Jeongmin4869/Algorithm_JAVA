import java.util.*;
import java.io.*;

class Main_B1182 {
    static int N;
    static int S;
    static int[] arr;
    static int result;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        result = 0;
        arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0);
        if(S==0) result -=1;
        System.out.println(result);
    }

    public static void dfs(int index, int sum){
        if(index == N){
            if(sum == S) result += 1;
            return;
        }
        
        dfs(index+1, sum+arr[index]);
        dfs(index+1, sum);
        return;
    }
}
