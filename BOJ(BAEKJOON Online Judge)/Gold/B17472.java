import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[] parent;;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int N, M;
    static List<Node> g;

    static class Node implements Comparable<Node>{
        int u, v, w;
        Node(int u, int v, int w){
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M  = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
            }
        }

        int idx = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    idx += 1;
                    dfs(i, j, idx);
                }
            }
        }

        g = new ArrayList<>();
        addNode();
        
        parent = new int[idx+1];
        for(int i=0; i<=idx; i++){
            parent[i] = i;
        }

        int count = 0;
        int val = 0;
        for(Node node : g){
            if(find(node.u) != find(node.v)){
                union(node.u, node.v);
                val += node.w;
                count += 1;
            }

            if(count == idx-1 ) break;
        }

        System.out.println(val);
    }

    public static int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a!=b) parent[b] = a;
    }
    
    public static void dfs(int x, int y, int num){
        visited[x][y] = true;
        map[x][y] = num;
        for(int i=0; i<4; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(xx>=0 && xx<N && yy>=0 && yy<M && !visited[xx][yy] && map[xx][yy]==1){
                dfs(xx, yy, num);
            }
        }
    }

    public static void addNode(){
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]==0) continue;

                boolean checkside = false;
                for(int k=0; k<4; k++){
                    int xx = i+dx[k];
                    int yy = j+dy[k];
                    if(xx>=0 && xx<N & yy>=0 && yy<M && map[xx][yy] == 0)
                        checkside = true;
                }

                if(!checkside) continue;

                int from = map[i][j];

                for(int k=0; k<4; k++){
                    int xx = i+dx[k];
                    int yy = j+dy[k];
                    int len = 0;

                    while(true){
                        if(xx<0 || xx>=N || yy<0 || yy>=M) break;

                        if(map[xx][yy] == 0){
                            len += 1;
                            xx += dx[k];
                            yy += dy[k];
                        }
                        else {
                            int to = map[xx][yy];
                            if(to == from) break;
                            if(len <= 1) break;
                            g.add(new Node(from, to, len));
                            break;
                        }
                    }
                }
            }
        }
    }
}
