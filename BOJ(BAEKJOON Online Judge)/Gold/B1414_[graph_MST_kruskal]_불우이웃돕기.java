import java.util.*;
import java.io.*;

class Main {
    static int[] parent;
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
        int N = Integer.parseInt(br.readLine());

        parent = new int[N+1];
        for(int i=0; i<=N; i++){
            parent[i] = i;
        }

        ArrayList<Node> edge = new ArrayList<>();
        int total = 0;
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
        
                char c = str.charAt(j);

                if(c == '0') continue;

                int w = 0;
                if('a'<=c && c<='z') w = (int)(c-'a')+1;
                else if('A'<=c && c<='Z') w = (int)(c-'A')+27;
                
                total += w;
                edge.add(new Node(i+1, j+1, w));
            }
        }     

        Collections.sort(edge);
        int min = 0;
        int count = 0;
        for(Node n : edge){
            if(find(n.u) != find(n.v)){
                count += 1;
                min += n.w;
                union(n.u, n.v);
            }
            if(count == N-1){
                System.out.print(total-min);
                return ;
                
            }
        }

        System.out.print(-1);
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
    
}
