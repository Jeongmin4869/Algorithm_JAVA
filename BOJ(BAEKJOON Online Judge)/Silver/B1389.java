import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][N];
        for(int i=0; i<N; i++){
            Arrays.fill(arr[i], INF);
            arr[i][i] = 0;
        }

        for(int i=0; i<M; i++){
            String str = br.readLine();
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-'A';
            int b = Integer.parseInt(st.nextToken())-'A';
            arr[a][b] = 1;
        }

        for(int k=0; k<N; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    arr[i][j] = Math.min(arr[i][j], arr[i][k]+arr[k][j]);
                }
            }
        }

        int num = 0;
        int maxsum = 0;
        for(int i=0; i<N; i++){
            int sum = 0;
            for(int j=0; j<N; j++){
                if(arr[i][j]<=6) sum += 1;
            }
           if(maxsum<sum){
               maxsum = sum;
               num = i;
           }
        }

        
        System.out.println(num);
    }
}
