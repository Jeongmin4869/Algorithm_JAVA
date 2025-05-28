import java.util.*;
import java.io.*;

class Main_B2823 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] map = new String[N][M];
        for(int i=0; i<N; i++){
            map[i] = br.readLine().split("");
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        for(int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                if(map[i][j].equals(".")){
                    int around = 0;
                    for(int k=0; k<4; k++){
                        int xx = i + dx[k];
                        int yy = j + dy[k];
                        if(xx >= 0 && xx < N && yy >=0 && yy < M && map[xx][yy].equals(".")){
                            around += 1;
                        }
                    }
                    if(around <= 1){
                        System.out.print("1");
                        return;
                    }
                }
            }
        }        
        System.out.println(0);
    }
}
