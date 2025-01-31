import java.util.*;
import java.io.*;

class Main_B1996 {
    static int N;
    static int[][] map ;
    static int[] dx = {1, 1, 1, 0, 0,-1,-1,-1};
    static int[] dy = {1, 0,-1, 1,-1, 1, 0,-1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for(int i=0; i<N; i++){
            String[] s = br.readLine().split("");
            for(int j=0; j<N; j++){
                String c = s[j];
                if(c.compareTo(".")!=0){
                    map[i][j] = Integer.parseInt(c);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j]>0) sb.append("*");
                else{
                    int count = check(i, j);
                    if(count >= 10) sb.append("M");
                    else sb.append(count);
                } 
            }
            sb.append("\n");
        }
                
        System.out.println(sb);
    }

     
    public static int check(int x, int y){
        int count = 0;
        for(int i=0; i<8; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(xx>=0 && xx<N && yy>=0 && yy<N){
                count += map[xx][yy];
            }
        }
        return count;
    }
}
