import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static int[] indegree;
    static ArrayList<ArrayList<Integer>> g;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }
        
        indegree = new int[N+1];
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            g.get(a).add(b);
            indegree[b] += 1;
        }

        khan();
        
    }

    public static void khan(){
        Queue<Integer> q = new LinkedList<>();
        int[] semester = new int[N+1];
        for(int i=1; i<=N; i++){
            semester[i] = 1;
            if(indegree[i] == 0)
                q.offer(i);
        }

        while(!q.isEmpty()){
            int cur = q.poll();
            for(int next : g.get(cur)){
                indegree[next] -= 1;
                semester[next] = Math.max(semester[next], semester[cur]+1);
                if(indegree[next] == 0){
                    q.offer(next);
                }
            }
        }

        for(int i=1; i<=N; i++){
            System.out.print(semester[i] + " ");
        }
    }
}
