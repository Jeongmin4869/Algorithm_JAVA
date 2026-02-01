import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static int[][] map;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    static class Node{
        int x, y, dist;
        Node(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map= new int[N][N];

        int x=0, y=0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 9){
                    x = i;
                    y = j;
                    map[i][j] = 0;
                }
            }
        }

        int result = bfs(x, y);

        System.out.print(result);
    }

    public static int bfs(int x, int y){
        int eat = 0;
        int level = 2;
        int time = 0;
        while(true){
            Queue<Node> q = new LinkedList<>();
            boolean[][] visited = new boolean[N][N];
            List<Node> fish = new ArrayList<>();
            q.offer(new Node(x, y, 0));
            visited[x][y] = true;
            int mindist = N*N;
            while(!q.isEmpty()){
                Node cur = q.poll();
                if(cur.dist > mindist) break;

                if(map[cur.x][cur.y]!=0 && map[cur.x][cur.y] <= level){
                    fish.add(cur);
                    mindist = cur.dist;
                }

                for(int i=0; i<4; i++){
                    int xx = x+dx[i];
                    int yy = y+dy[i];
                    if(xx>=0&&xx<N&&yy>=0&&yy<N&&!visited[xx][yy]&&map[xx][yy]<level){
                        visited[xx][yy] = true;
                        q.offer(new Node(xx, yy, cur.dist+1));
                    }
                }

                if(fish.size() == 0) break;

                fish.sort((o1, o2)->{
                    if(o1.y == o2.y) return o1.x-o2.x;
                    return o1.y - o2.y;
                });

                Node eatfish = fish.get(0);
                time += eatfish.dist;
                x = eatfish.x;
                y = eatfish.y;
                map[x][y] = 0;
                eat += 1;
                if(eat == level){
                    level += 1;
                    eat = 0;
                }
            }
            return time;
        }
    }
}
