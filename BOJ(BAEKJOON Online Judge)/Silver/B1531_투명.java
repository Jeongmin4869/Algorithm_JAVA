import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[101][101];
        boolean[][] visited = new boolean[101][101];
        int count = 0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int j=y1; j<=y2; j++){
                for(int k=x1; k<=x2; k++){
                    arr[j][k] += 1;
                    if(arr[j][k]>M&&(!visited[j][k])){
                        count += 1;
                        visited[j][k] = true;
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}ㅔ
