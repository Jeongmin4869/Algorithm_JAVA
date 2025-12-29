import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static ArrayList<ArrayList<Integer>> g;
    static int[] indegree;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        indegree = new int[N+1];
        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.get(u).add(v);
            indegree[v] += 1;
        }

        khan();
    }

    public static void khan(){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=N; i++){
            if(indegree[i] == 0)
                q.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            int top = q.poll();
            sb.append(top + " ");

            for(int i=0; i<g.get(top).size(); i++){
                int idx = g.get(top).get(i);
                indegree[idx] -= 1;
                if(indegree[idx] == 0){
                    q.offer(idx);
                }
            }
        }
        System.out.print(sb);
    }
}
