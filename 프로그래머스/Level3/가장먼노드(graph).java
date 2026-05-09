import java.util.*;

class Solution {
    private ArrayList<ArrayList<Integer>> g;
    private int[] dist;
    
    public int solution(int n, int[][] edge) {
        
        dist = new int[n+1];
        Arrays.fill(dist, -1);
        g = new ArrayList<>();
        for(int i=0; i<=n; i++){
            g.add(new ArrayList<>());
        }
        for(int[] arr : edge){
            int u = arr[0];
            int v = arr[1];
            g.get(u).add(v);
            g.get(v).add(u);
        }

        bfs(1);

        int max = 0;
        for(int i=0; i<dist.length; i++){
            max = Math.max(dist[i], max);
        }

        int result = 0;
        for(int i=1; i<=n; i++){
            if(dist[i]==max) result += 1;
        }
        
        return result;
        
    }

    public void bfs(int s){
        Queue<Integer> q = new LinkedList<>();
        dist[s] = 0;
        q.offer(s);
        while(!q.isEmpty()){
            int node = q.poll();
            for(int newnode : g.get(node)){
                if(dist[newnode]==-1){
                    dist[newnode] = dist[node]+1;
                    q.offer(newnode);
                }
            }
        }
        
    }
}
