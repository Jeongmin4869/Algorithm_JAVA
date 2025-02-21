import java.util.*;
import java.io.*;

class Main_B2567 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] map = new boolean[100][100];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    map[j][k] = true;
                }
            }
        }

        int count = 0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(map[i][j]){
                    for(int k =0; k<4; k++){
                        int xx = i+dx[k];
                        int yy = j+dy[k];
                        if(xx>=0&&xx<100&&yy>=0&&yy<100&&!map[xx][yy]){
                            count += 1;
                            
                        }
                        // 종이범위를 넘어선다면 둘레를 잰다. 
                        else if (xx<0||xx>=100||yy<0||yy>=100){
                            count += 1;
                            
                        }
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}
