import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            ArrayList<ArrayList<Integer>> g = new ArrayList<>();
            for(int j=0; j<=N; j++){
                g.add(new ArrayList<>());
            }

            // 저장할 필요 없는 데이터
            for(int j=0; j<M; j++){
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                g.get(u).add(v);
                g.get(v).add(u);
            }

            // 주어지는 그래프는 모두 연결그래프
            // 모든 정점을 연결하는 최소 간선의 개수 = N - 1
            System.out.println(N-1);
        }
        
    }
}
