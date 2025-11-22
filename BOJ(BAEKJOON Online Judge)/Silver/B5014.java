import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int F, S, G,U, D; 
    static int min=1000000;
    static int[] check = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        Arrays.fill(check, 1000000);
        
        dfs(S, 0);

        if(check[G]!=1000000) System.out.print(check[G]);
        else System.out.print("use the stairs");
    }

    public static void dfs(int s, int dep){
        if(s==G){
            check[G] = Math.min(check[G], dep);
            return;
        }

        if(s+U<=F && check[s+U]>dep+1){
            dfs(s+U, dep+1);
        }
        if(s-D>=0 && check[s-D]>dep+1){
            dfs(s-D, dep+1);
        }
    }
}
