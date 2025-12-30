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
        N = Integer.parseInt(br.readLine());

        g = new ArrayList<>();
        for(int i=0; i<=N; i++){
            g.add(new ArrayList<>());
        }
        
        indegree = new int[N+1];
        time = new int[N+1];
        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            time[i] = t;
            int M = Integer.parseInt(st.nextToken());
            for(int j=0; j<M; j++){
                int pre = Integer.parseInt(st.nextToken());
                g.get(pre).add(i);
                indegree[i] += 1;
            }
        }

        int result = khan();
        
        System.out.println(result);
    }

    public static int khan(){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=N; i++){
            if(indegree[i]==0) q.offer(i);
        }
        int times = 0;
        while(!q.isEmpty()){
            int top = q.poll();
            times += time[top];
            for(int idx : g.get(top)){
                indegree[idx] -= 1;
                if(indegree[idx] == 0)
                    q.offer(idx);
            }
        }
        return times;
    }

}
