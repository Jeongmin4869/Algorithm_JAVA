// 완전탐색
/* 
import java.util.*;

public class Main_B2798 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        
        int num = 0;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum <= max) num = Math.max(num, sum);
                }
            }
        }
        
        System.out.println(num);
        
        sc.close();
    }
}
*/

// DFS
import java.util.*;

public class Main {
    private static int N, max, answer;
    private static boolean[] visited;
    private static int[] arr;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        max = sc.nextInt();
        arr = new int[N];
        visited = new boolean[N];
        
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        
        dfs(0, 0);
        System.out.println(answer);
        sc.close();
    }
    
    private static void dfs(int sum, int cnt){      
        if(cnt >= 3){
            if(sum <= max) answer = Math.max(answer,sum);
            return;
        }
        
        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(sum+arr[i], cnt+1);
                visited[i] = false;
            }
        }
    }
}
