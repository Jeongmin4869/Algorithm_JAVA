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
    static int[] d;
    static final int INF = Integer.MAX_VALUE;

    static class Node implements Comparable<Node> {
        int to;
        int w;

        Node(int to, int w){
            this.to = to;
            this.w = w;
        }    

        // 우선순위 큐 사용을 위해 비교함수 override
        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        d = new int[V+1];
        Arrays.fill(d, INF);
        ArrayList<ArrayList<Node>> g = new ArrayList<>();
        for(int i=0; i<=V; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v, w));
        }

        daijkstra(K, g);

        for(int i=1; i<=V; i++){
            if(d[i]==INF)
                System.out.println("INF");
            else
                System.out.println(d[i]);
        }
        
    }

    public static void daijkstra(int K, ArrayList<ArrayList<Node>> g){
        // 비용이 적은 순으로 정렬된 우선순위큐
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(K, 0));
        d[K] = 0;
        while(!pq.isEmpty()){
            Node now = pq.poll();
            
            if(now.w > d[now.to]) continue;
            
            for(int i=0; i<g.get(now.to).size(); i++){
                Node newnode = g.get(now.to).get(i);
                int cost = d[now.to] + newnode.w;
                if(cost < d[newnode.to]){
                    d[newnode.to] = cost;
                    // 출발노드부터 목적지노드까지의 비용을 업데이트하여 큐에 노드 추가
                    // 현재노드까지의 총 비용
                    pq.offer(new Node(newnode.to, cost));
                }
            }
        }
    }
}
