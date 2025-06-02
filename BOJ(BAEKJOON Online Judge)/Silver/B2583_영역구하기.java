import java.util.*;
import java.io.*;

class Main {

    static boolean[][] arr;
    static int count;
    static int N, M;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new boolean[M][N];
        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int j=y1; j<y2; j++){
                for(int k=x1; k<x2; k++){
                    arr[j][k] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(!arr[i][j]){
                    count = 1;
                    list.add(bfs(i, j));
                }
            }
        }

        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i) + " ");
        }
        
        System.out.println(list.size());
        System.out.print(sb);
    }

    public static int dfs(int x, int y){

        arr[x][y] = true;
        for(int i=0; i<4; i++){
            int xx = dx[i] + x;
            int yy = dy[i] + y;
            if(xx>=0 && xx<M && yy>=0 && yy <N && !arr[xx][yy]){
                count += 1;
                dfs(xx, yy);
            }
        }
        return count;
    }

    public static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        arr[x][y] = true;
        q.add(new int[]{x,y});
        
        while(!q.isEmpty()){
            int[] top = q.poll();
            int px = top[0];
            int py = top[1];
            for(int i=0; i<4; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0 && xx<M && yy>=0 && yy<N && !arr[xx][yy]){
                    q.offer(new int[] {xx,yy});
                    count += 1;
                    arr[xx][yy] = true;
                }
            }
        }
        return count;
    }
}
