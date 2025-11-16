import java.util.*;
import java.lang.*;
import java.io.*;

/*
그래프의 최단 경로 탐색
- BFS : 가중치가 없는 그래프의 최단경로를 찾는 경우 사용할 수 있다. 
- 다익스트라 : 그래프에 가중치가 있을 때 사용할 수 있다. 단, 음수간선이 없을 때 사용한다. 
             단일 출발점으로부터 모든 정점까지의 최단거리를 계산한다. 
- 플로이드워셜 : 모든 정점에서부터 모든 정점까지이 최단 거리를 구한다. 
             음수 가중치가 가능하다 

플로이드 워셜 알고리즘 동작단계
1. 모든 노드간의 최단 거리를 저장할 2차원 배열을 준비한다. 
   - 자기 자신으로 가는 비용은 0
   - 간선이 존재하는 노드는 해당 간선의 최소값으로 초기화
   - 간선이 없는 노드는 INF 초기화 
2. 거쳐갈 노드 k를 선책
3. 모든 노드 쌍에 대해 아래와 같이 비교
   - 출발노드 i, 도착노드 j, 거쳐갈 노드 k
   - 직접가는경로 (i->j)보다 거쳐가는 경로(i->k->j)가 더 짧다면 거리 배열 갱신
4. 2~3의 과정을 k가 모든 노드를 돌 때까지 반복
*/

class Main {
    static int N;
    static long[][] dist;
    static final long INF = 100000L * 100000;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        dist = new long[N+1][N+1];
        for(int i=1; i<=N; i++){
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            dist[u][v] = Math.min(dist[u][v], d);
        }

        floyd();
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++){            
            for(int j=1; j<=N; j++){
                if(dist[i][j] == INF) sb.append("0 ");
                else sb.append(dist[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void floyd(){
        for(int k=1; k<=N; k++){ // 거쳐갈 노드 k
            for(int i=1; i<=N; i++){ // 출발 노드 i
                for(int j=1; j<=N; j++){ // 도착 노드 j
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
    }
}
