import java.util.*;
import java.io.*;

class Main_B1895 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int num = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<=N-3; i++){            
            for(int j=0; j<=M-3; j++){
                int[] filter = new int[9];
                int index = 0;
                for(int x=i; x<i+3; x++){
                    for(int y=j; y<j+3; y++){
                        filter[index++] = arr[x][y];
                       
                    }
                }
                Arrays.sort(filter);
                
                if(filter[4]>=num) count += 1;
            }
        }              
        System.out.println(count);
    }
}
