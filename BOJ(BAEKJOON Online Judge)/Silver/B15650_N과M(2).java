/* 조합 */
import java.util.*;

public class Main_B15650 {
    static boolean[] visited;
    static int[] result;
    static int N, M;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
    
        result = new int[M];
        visited = new boolean[N];
        dfs(0,0);
        sc.close();
    }

    public static void dfs(int now, int index){
        if(now == M){
            print();
            return;
        }
        for(int i=index; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                result[now] = i+1;
                dfs(now+1, i);
                visited[i] = false;
            }
        }
    }

    public static void print(){
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

}
