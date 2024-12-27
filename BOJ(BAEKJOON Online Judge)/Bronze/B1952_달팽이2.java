import java.util.*;
import java.io.*;

class Main_B1952 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[][] visited = new boolean[M][N];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int x = 0;
        int y = 0;
        int direction = 0; // 회전 방향
        int visitCnt = 1; // 총 방문 수 
        visited [x][y] = true;
        
        int result = 0;

        while(true){
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if(visitCnt == N*M) break;
            
            if(nx>=0 && nx<M && ny >=0 && ny<N && !visited[nx][ny]){
                x = nx;
                y = ny;
                visited[x][y] = true;
                visitCnt += 1;
            }
            else {
                direction = (direction+1)%4;
                result += 1;
            }
        }
        
        System.out.print(result);
    }
}
