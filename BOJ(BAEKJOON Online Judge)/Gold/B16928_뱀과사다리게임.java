import java.util.*;
import java.io.*;

class Main_B16928 {

    static boolean[] visited = new boolean[101];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<N+M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            m.put(s, e);
        }

        int result = bfs(m);
        
        System.out.println(result);
    }

    public static int bfs(Map<Integer, Integer> map){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1, 0});
        visited[1] = true;
        while(!q.isEmpty()){
            int[] arr = q.poll();
            int now = arr[0];
            int count = arr[1];

            if(now == 100) return count;
            
            for(int i=1; i<=6; i++){
                int newnode = now + i;            
                
                if(map.containsKey(newnode)){
                    newnode = map.get(newnode);
                }
                
                if(newnode <= 100 && !visited[newnode]){
                    visited[newnode] = true;
                    q.offer(new int[] {newnode, count + 1});
                }
            }
        }
        return 0;
    }
}
