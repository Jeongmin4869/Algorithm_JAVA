import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, M;
    static int max = 100001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int result = bfs();
        
        System.out.println(result);
    }

    public static int bfs(){
        Deque<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[max];
        visited[N] = true;
        q.offerLast(new int[]{N, 0});
        while(!q.isEmpty()){
            int[] top = q.poll();
            int now = top[0];
            int t = top[1];
            if(now == M) return t;

            // ㅂㅏㅇㅁㅜㄴ ㅊㅔㅋㅡㅎㅏㄱㅣ ㄸㅒㅁㅜㄴㅇㅖ ㅅㅜㄴㅅㅓ ㅈㅜㅇㅇㅛ
            if(now*2<max && !visited[now*2]){
                q.offerFirst(new int[]{now*2, t});
                visited[now*2] = true;
            }
            if(now+1<max && !visited[now+1]){
                q.offerLast(new int[]{now+1, t+1});
                visited[now+1] = true;
            }

            if(now-1>=0 && !visited[now-1]){
                q.offerLast(new int[]{now-1, t+1});
                visited[now-1] = true;
            }
        }
        return -1;
    }
}
