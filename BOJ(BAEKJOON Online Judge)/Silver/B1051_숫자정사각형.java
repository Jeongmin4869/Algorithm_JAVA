import java.util.*;
import java.io.*;

class Main_B1051 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] arr = new String[N][M];
        for(int i=0; i<N; i++){
            arr[i] = br.readLine().split("");
        }

        int max = 1 ;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                for(int k=1; (i+k)<N&& (j+k)<M; k++){
                    if(arr[i][j].equals(arr[i][j+k])&&
                       arr[i][j].equals(arr[i+k][j])&&
                       arr[i][j].equals(arr[i+k][j+k]))
                        max = Math.max(max, k+1);
                }
            }
        }

        System.out.println(max*max);

        br.close();
    }

}
