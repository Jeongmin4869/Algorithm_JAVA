import java.util.*;
import java.lang.*;
import java.io.*;

/*
그래프의 최단 경로 탐색
BFS : 가중치가 없는 그래프의 최단경로를 찾는 경우 사용할 수 있다. 
다익스트라 : 그래프에 가중치가 있을 때 사용할 수 있다. 단, 음수간선이 없을 때 사용한다. 


다익스트라 알고리즘 동작단계
1. 출발노드와 도착노드를 설정한다.
2. 최단 거리를 저장할 데이터를 무한대(INF)로 초기화한다.
3. 시작 노드와 직접적으로 연결된 모든 정점들의 거리를 비교하여 업데이트시킨다. 
4. 방문한 정점들 중 가장 가중치 값이 작은 정점을 방문한다. 
5. 해당 정점을 거쳐서 갈 수 있는 정점의 거리가 현재 기록된 값보다 작다면, 해당 값을 갱신한다. 
6. 4~5의 과정을 반복한다. 
*/

class Main {
    static int N;
    static ArrayList<ArrayList<Node>> g;
    static final int INF = Integer.MAX_VALUE;

    static class Node implements Comparable<Node>{
        int to;
        int cost;
        Node(int to, int cost ){
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o){
            return this.cost - o.cost;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v, d));
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++){
            int[] line = djilkstra(i);
            for(int j=1; j<=N; j++){
                if(line[j] == INF) sb.append("0 ");
                else sb.append(line[j]+" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static int[] djilkstra(int from){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(from, 0));
        int[] dist = new int[N+1];
        Arrays.fill(dist, INF);
        dist[from] = 0;
        while(!pq.isEmpty()){
            Node now = pq.poll();
            
            if(now.cost > dist[now.to]) continue;
            
            for(Node newnode : g.get(now.to)){
                int nextCost = now.cost + newnode.cost;
                if(nextCost < dist[newnode.to]){
                    dist[newnode.to] = nextCost;
                    pq.offer(new Node(newnode.to, nextCost));
                }       
            }
        }
        return dist;
    }

    /*

    public static int bfs(int from, int to){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {from, 0});
        while(!q.isEmpty()){
            int[] top = q.poll();
            int now = top[0];
            int sum = top[1];
            if(now == to) return sum;
            for(Node newnode : g.get(now)){
                q.offer(new int[]{newnode.a, sum + newnode.dis});
            }
        }
        return 0;
    }

    */
}
