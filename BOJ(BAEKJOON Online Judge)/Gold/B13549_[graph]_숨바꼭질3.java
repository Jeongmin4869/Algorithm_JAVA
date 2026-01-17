import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M;
    static int min = 100001;
    static int max = 100001;

    static class Node{
        int p, t;
        Node(int p, int t){
            this.p = p;
            this.t = t;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        bfs();
       
        System.out.println(min);
    }

    public static void bfs(){
        Queue<Node> q = new LinkedList<>();
        boolean[] visited = new boolean[max+1];
        visited[N] = true;
        q.offer(new Node(N, 0));
        while(!q.isEmpty()){
            Node top = q.poll();
            visited[top.p] = true;
            if(top.p == M) min=Math.min(min, top.t);

            if(top.p*2<=max && !visited[top.p*2]) q.offer(new Node(top.p*2, top.t));
            if(top.p+1<=max && !visited[top.p+1]) q.offer(new Node(top.p+1, top.t+1));
            if(top.p-1>=0   && !visited[top.p-1]) q.offer(new Node(top.p-1, top.t+1));
        }
    }
    
}
