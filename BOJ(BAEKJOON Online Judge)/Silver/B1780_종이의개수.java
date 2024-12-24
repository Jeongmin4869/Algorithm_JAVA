import java.util.*;
import java.io.*;

class Main_B1780 {
    static int N;
    static int[][] arr;
    static Nums nums;

    public static class Nums{
        int zero;
        int one;
        int minus;
        void nums(){
            zero = 0;
            one = 0;
            minus = 0;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        nums = new Nums();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0,arr[0][0], N);

        System.out.println(nums.minus);
        System.out.println(nums.zero);
        System.out.println(nums.one);
        
        
        
    }

    public static void dfs(int x, int y, int now, int size){
        boolean flag = false;
        int count = 0;
        for(int i=x; i<x+size; i++){
            for(int j=y; j<y+size; j++){
                if(arr[i][j] != now){
                    flag = true; 
                    break;
                } 
                count += 1;
            }
        }

        if(count == size*size){
            if(now == 0) nums.zero += 1;
            else if(now == 1) nums.one += 1;
            else if(now == -1) nums.minus += 1;
            return;
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                dfs((size/3)*i+x, (size/3)*j+y, arr[(size/3)*i+x][(size/3)*j+y],size/3 );
            }
        }
        
    }
}
