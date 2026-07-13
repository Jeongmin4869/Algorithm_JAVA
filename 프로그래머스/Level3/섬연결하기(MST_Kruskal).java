import java.util.*;
import java.io.*;

class Solution {
    
    static int[] parents;
    
     public static class Node implements Comparable<Node>{
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
    public int solution(int n, int[][] costs) {
        int answer = 0;
        parents = new int[n+1];
        
        for(int i=1; i<=n; i++){
            parents[i] = i;
        }
        
        List<Node> list = new ArrayList<>();
        for(int[] cost : costs){
            int u = cost[0];
            int v = cost[1];
            int w = cost[2];
            list.add(new Node(u, v, w));
        }
        
        Collections.sort(list);
        
        int cnt = 0;
        for(Node node : list){
            if(find(node.u) != find(node.v)){
                union(node.u, node.v);
                cnt += 1;
                answer += node.w;
            }
            if(cnt == n-1) break;
        }
        
        return answer;
      
    }
    
    // Union : 두 집함을 루트기준으로 합친다 
    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a != b){
            parents[b] = a;
        }
    }
    
    // Find : 부모 노드를 찾는다 (경로 압축 사용)
    public static int find(int x){
        if(parents[x] == x) return x;
        return parents[x] = find(parents[x]);
    }
}
