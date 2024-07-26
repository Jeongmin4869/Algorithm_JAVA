import java.util.*;
import java.io.*;

class Main_B14889 {
    static int min = Integer.MAX_VALUE;
    static int N ;
    static int[][] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N];
        StringTokenizer st  ;
        for(int i=0; i<N; i++){
            st  = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        System.out.println(min);
        br.close();

    }

    public static void dfs(int index, int count){

        if(count == N/2){
            func();
            return;
        }

        for(int i=index; i<N; i++){
            visited[i] = true;
            dfs(i+1, count+1);
            visited[i] = false;
        }        
    }

   public static void func(){
       int sum1=0, sum2=0, m;
       for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visited[i]&&visited[j]) sum1+=arr[i][j];
                else if(!visited[i]&&!visited[j]) sum2+=arr[i][j];
            }
        }
       m=Math.abs(sum1-sum2);
       if(m<min) min = m;
   }
}
