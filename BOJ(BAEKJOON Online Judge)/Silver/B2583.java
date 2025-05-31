import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    static int[][] arr;
    static boolean[][] visited;
    static int count, total;
    static int N, M;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken())+1;
        N = Integer.parseInt(st.nextToken())+1;
        int K = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int j=y1; j<y2; j++){
                for(int k=x1; k<x2; k++){
                    arr[j][k] = 1;
                }
            }
        }

        total = 0;
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==0&&!visited[i][j]){
                    count = 0;
                    total += 1;
                    dfs(i, j);
                    list.add(count);
                }
            }
        }

        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i) + " ");
        }
        
        System.out.println(total);
        System.out.print(sb);
    }

    public static void dfs(int x, int y){

        for(int i=0; i<4; i++){
            int xx = dx[i] + x;
            int yy = dy[i] + y;
            if(xx>=0 && xx<=N && yy>=0 && yy <M && arr[xx][yy] == 0 && !visited[xx][yy]){
                count += 1;
                dfs(xx, yy);
            }
        }
    }
}
