import java.util.*;

class Solution {
    static ArrayList<ArrayList<Node>> list ;
    public static class Node implements Comparable<Node>{
        int to, w;
        Node(int to, int w){
            this.to = to;
            this.w = w;
        }
        
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        list = new ArrayList<>();
        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }
        
        for(int[] cost : costs){
            int u = cost[0];
            int v = cost[1]; 
            int w = cost[2];
            list.get(u).add(new Node(v, w));
            list.get(v).add(new Node(u, w));
        }
        
        answer = prim(1, n);
        
        return answer;
    }
    
    public static int prim(int s, int N){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[N+1];
        int count = 0;
        int val = 0;        
        pq.offer(new Node(s, 0));
        while(!pq.isEmpty()){
            Node top = pq.poll();
            
            if(visited[top.to])
                continue;
                
            visited[top.to] = true;
            count += 1;
            val += top.w;
            
            for(Node node : list.get(top.to)){
                if(!visited[node.to]){
                    pq.offer(node);
                }
            }
            
            if(count == N) break;
        }
        return val; 
    }
}
