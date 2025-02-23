import java.util.*;
import java.io.*;

class Main_B2422 {
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] arr = new boolean[N+1][N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = true;
            arr[b][a] = true;
        }

        int count = 0;
        for(int i=1; i<=N-2; i++){
            for(int j=i+1; j<=N-1; j++){
                for(int k=j+1; k<=N; k++){
                    if(!arr[i][j] && !arr[i][k] && !arr[j][k]){
                        count += 1;
                    }
                }
            }
        }
        
        System.out.print(count);
    }
}
