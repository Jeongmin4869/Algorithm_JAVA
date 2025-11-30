import java.util.*;
import java.io.*;

/*

MST : 최소비용신장트리
- 그래프의 모든 정점을 연결하면서 사용한 간선들의 총 비용이 최소가 되는 트리구조

Prim (정점중심, 확장형 MST)
1. 임의의 시작 정점을 선택하고 방문처리한다.
2. 현재 MST에서 나가는 모든 간선을 우선순위 큐에 넣는다
3. 우선순위큐에서 가장 비용이 작은 간선을 꺼낸다.
4. 해당 간선이 아직 방문되지 않았다면 MST에 추가한다.
5. 새로 추가한 정점에서 나가는 모든 간선을 우선순위 큐에 넣는다.
6. 모든 정점이 방문되기까지 3~5 단계를 반복한다. 

*/


class Main {

    static int N;
    static ArrayList<ArrayList<Node>> g;
    
    static class Node implements Comparable<Node>{
        int to, w;
        Node(int to, int w){
            this.to = to;
            this.w  = w;
        }

        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }
    
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            g.get(u).add(new Node(v, w));
            g.get(v).add(new Node(u, w));            
        }
        System.out.print(prim(1));
    }

    public static int prim(int s){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[N+1];        
        pq.offer(new Node(s, 0));
        int count = 0;
        int mstCost = 0;
        while(!pq.isEmpty()){
            Node top = pq.poll();
            int to = top.to;
            int w = top.w;
            if(visited[to]) continue;
            visited[to] = true;
            mstCost += w;
            count += 1;

            if(count == N) break;

            for(Node newnode : g.get(to)){
                if(!visited[newnode.to]){
                    pq.offer(newnode);
                }
            }
        }
        return mstCost;
    }
}
