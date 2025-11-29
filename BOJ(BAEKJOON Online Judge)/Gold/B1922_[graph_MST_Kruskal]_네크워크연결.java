import java.util.*;
import java.lang.*;
import java.io.*;


/*
MST : 최소 신장 트리. 가중치의 합이 최소가 되는 스패닝 트리를 만드는 문제

크루스칼(Kruskal)
	•	간선을 비용 기준으로 정렬
	•	Union-Find로 사이클 체크
	•	N–1개의 간선이 선택되면 종료

*/
class Main {
    static int[] parent;

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
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        parent = new int[N+1];
        for(int i=0; i<=N; i++){
            parent[i] = i;
        }

        ArrayList<Node> edge = new ArrayList<>();
        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());
            edge.add(new Node(u, v, w));
        }

        Collections.sort(edge);

        long val=0;
        int cnt = 0;
        for(Node node : edge){
            if(find(node.u)!=find(node.v)){
                union(node.u, node.v);
                val += node.w;
                cnt += 1;
            }
            if(cnt == N-1) break;
        }

        System.out.println(val);
    }

    public static int find(int x){
        if(x == parent[x]) return x;
        return parent[x] = find(parent[x]); // 경로압축
    }

    // 루트끼리 union
    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a!=b){
            parent[b] = a;
        }
    }
}
