import java.util.*;
import java.io.*;

class Main {
    
    static int num;
    static int[] arr;
    static int[] result = new int[6];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());

            // 입력의 마지막줄 0 
            if(num == 0) break;

            arr = new int[num];
            for(int i=0; i<num; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);

            System.out.println();
            
        }
        
    }

    // boolean[] visitied => 순열구하기 (중복O)
    // strat를 업데이트 -> 조합구하기 (중복X)
    public static void dfs(int dep, int start){
        if(dep == 6){
            for(int i=0; i<6; i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return; 
        }

        for(int i=start; i<num; i++){
            result[dep] = arr[i];
            dfs(dep+1, i+1);
        }
    }

}
