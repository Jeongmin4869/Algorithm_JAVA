import java.util.*;

class Main_B15652 {
    static int N, M;
    static int[] result;
    static StringBuilder sb;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        N = sc.nextInt();
        M = sc.nextInt();
        result = new int[M];
        dfs(0, 0);
        System.out.println(sb);
        sc.close();
    }

    public static void dfs(int index, int now){
        if(index == M){
            print();
            return;
        }

        for(int i=now; i<N; i++){
            result[index] = i+1;
            dfs(index+1,i);
        }
        
    }

    public static void print(){
        for(int i=0; i<result.length; i++){
            sb.append(result[i] + " ");
        }
        sb.append("\n");
    }
    
}
