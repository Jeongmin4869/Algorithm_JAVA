import java.util.*;

class Main_B15651 {

    static int[] result;
    static int N, M;
    static StringBuilder sb;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        N = sc.nextInt();
        M = sc.nextInt();
        result = new int[M];
        dfs(0);
        System.out.print(sb);
        sc.close();
    }

    public static void dfs(int index){
        if(index == M){
            print();
            return;
        }
        for(int i=0; i<N; i++){
            result[index] = i+1;
            dfs(index+1);
        }
    }

    public static void print(){
        for(int i=0; i<result.length; i++){
            sb.append(result[i] + " ") ;
        }
        sb.append("\n");
    }
}
