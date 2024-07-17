/*  방법1 */
/*
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int[][] dp = new int[N][N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<i+1; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = arr[i][j];
            }
        }

        for(int i=0; i<N-1; i++){
            for(int j=0; j<i+1; j++){
                dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j] + arr[i+1][j] );
                dp[i+1][j+1] = Math.max(dp[i+1][j+1], dp[i][j] + arr[i+1][j+1] );
            }
        }

        int maxval = dp[N-1][0];
        for(int i=1; i<N; i++){
            maxval = Math.max(maxval, dp[N-1][i]);
        }
        
        System.out.println(maxval);
    }
}

*/

/*  방법2 */

import java.util.*;
import java.io.*;

class Main_B1932 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<i+1; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=N-2; i>=0; i--){
            for(int j=0; j<=i; j++){
                arr[i][j] += Math.max(arr[i+1][j], arr[i+1][j+1]);
            }
        }

        System.out.println(arr[0][0]);
    }
}
