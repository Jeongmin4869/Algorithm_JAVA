import java.util.*;

public class Main_B15649 {
    static boolean[] visited;
    static int[] result;
    static StringBuilder sb;
    static int N, M;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        N = sc.nextInt();
        M = sc.nextInt();
    
        result = new int[M];
        visited = new boolean[N];
        dfs(0);
        sc.close();
    }

    public static void dfs(int count){
        if(count == M){
            print();
            return;
        }

        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                result[count] = i+1;
                dfs(count+1);
                visited[i] = false;
            }
        }        
    }

    public static void print(){
        for(int i=0; i<M; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

}
