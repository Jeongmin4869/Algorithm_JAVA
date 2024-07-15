import java.util.*;
import java.io.*;

class Main_B1149 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];
        int[][] val = new int[N][3];
        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        val[0][0] = arr[0][0] ;
        val[0][1] = arr[0][1] ;
        val[0][2] = arr[0][2] ;
                                         
        for(int i=1; i<N; i++){
            val[i][0] = arr[i][0] + Math.min(val[i-1][1],val[i-1][2]);
            val[i][1] = arr[i][1] + Math.min(val[i-1][0],val[i-1][2]);
            val[i][2] = arr[i][2] + Math.min(val[i-1][1],val[i-1][0]);
            
            
        }

        int minVal = Math.min(val[N-1][0], Math.min(val[N-1][1], val[N-1][2]));
        
        System.out.println(minVal);

        br.close();

    }
}
