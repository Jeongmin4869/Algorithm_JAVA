import java.util.*;
import java.io.*;

class Main {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][N];
        long[][] sums = new long[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] =Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sums[i][j] = arr[i][j];
                if(i-1>=0) sums[i][j] += sums[i-1][j];
                if(j-1>=0) sums[i][j] += sums[i][j-1];
                if (i - 1 >= 0 && j - 1 >= 0) sums[i][j] -= sums[i - 1][j - 1];
            }
        }

        sb= new StringBuilder();
        for(int i=0; i<M; i++){
            func(br.readLine(), sums);
        }
        
        System.out.println(sb);
    }

    public static void func(String str, long[][] sums){
        String[] s = str.split(" ");
        int x1 = Integer.parseInt(s[0])-1;
        int y1 = Integer.parseInt(s[1])-1;
        int x2 = Integer.parseInt(s[2])-1;
        int y2 = Integer.parseInt(s[3])-1;
        long sum = sums[x2][y2] ;
        if(x1-1>=0) sum -= sums[x1-1][y2];
        if(y1-1>=0) sum -= sums[x2][y1-1];
        if(y1-1>=0 && x1-1>=0) sum += sums[x1-1][y1-1];
        sb.append(sum).append("\n");
    }
    
}
