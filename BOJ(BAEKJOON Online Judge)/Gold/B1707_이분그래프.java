import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for(int i=0; i<K; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            for(int j=0; j<=V; j++){
                list.add(new ArrayList<Integer>());
            }
            
            for(int k=0; k<E; k++){
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                list.get(u).add(v);
                list.get(v).add(u);
            }

            // boolean[] visited = new boolean[V+1];
            int[] colors = new int[V+1];
            boolean check = true;
            for(int j=1; j<=V; j++){
                if(colors[j] == 0){
                    if(!dfs(list, j, colors, 1)){
                        check = false;
                        break;
                    }
                }
                
            }

            if(check) System.out.println("YES");
            else System.out.println("NO");
        }        
    }

    public static boolean bfs(ArrayList<ArrayList<Integer>> list, int node, int[] colors){
        int color = 1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        colors[node] = color;
        while(!q.isEmpty()){
            int top = q.poll();
            int newcolor = colors[top] * -1;
            for(int i=0; i<list.get(top).size(); i++){
                int newnode = list.get(top).get(i);
                if(colors[newnode] == 0){
                    colors[newnode] = newcolor;
                    q.add(newnode);
                }
                else if(colors[newnode] == colors[top]){                    
                    return false;
                }
            }
        }
        return true;
    }

    
    public static boolean dfs(ArrayList<ArrayList<Integer>> list, int node, int[] colors, int color){

        // 호출하면서 색을 변경 
        colors[node] = color;
        int newcolor = color * -1;
        
        for(int i=0; i<list.get(node).size(); i++){
            int newnode = list.get(node).get(i);
            // 방문한 노드인지를 먼저 확인
            if(colors[newnode] == 0){
                if(!dfs(list, newnode, colors, newcolor)){
                    return false;
                }
            }
            // 방문하였다면 색을 확인
            if(colors[newnode] == color) return false;                                    

        }
        return true;        
    }
}
