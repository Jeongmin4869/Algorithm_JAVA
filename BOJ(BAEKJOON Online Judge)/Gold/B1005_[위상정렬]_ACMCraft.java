import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N;
    static int[] indegree;
    static int[] time;
    static ArrayList<ArrayList<Integer>> g;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int x=0; x<T; x++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            g= new ArrayList<>();
            
            for(int i=0; i<=N; i++){
                g.add(new ArrayList<>());
            }

            time = new int[N+1];
            st = new StringTokenizer(br.readLine());
            for(int i=1; i<=N; i++){
                time[i] = Integer.parseInt(st.nextToken());
            }
            indegree = new int[N+1];

            for(int i=0; i<M; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                indegree[b] += 1;
                g.get(a).add(b);
            }

            int idx = Integer.parseInt(br.readLine());

            int result = khan(idx);

            System.out.println(result);
        }
        
    }

    public static int khan(int idx){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=N; i++){
            if(indegree[i] == 0)
                q.offer(i);
        }

        int[] dp = time.clone();
        while(!q.isEmpty()){
            int top = q.poll();
            for(int next : g.get(top)){
                dp[next] = Math.max(dp[top] + time[next] , dp[next]);
                indegree[next] -= 1;
                if(indegree[next] == 0)
                    q.offer(next);
            }
        }
        return dp[idx];
    }
}
