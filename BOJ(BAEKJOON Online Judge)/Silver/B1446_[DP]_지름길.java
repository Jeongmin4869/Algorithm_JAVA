import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static class Pos{
        int s;
        int e; 
        int l;
        Pos(int s, int e, int l){
            this.s=s;
            this.e = e;
            this.l = l;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int[] dp = new int[D+1];

        for(int i=1; i<=D; i++){
            dp[i] = i;
        }

        List<Pos> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            if(e>D) continue;
            if(e-s<=l) continue;
            list.add(new Pos(s, e, l));
        }

        Collections.sort(list, (o1, o2)->{
            return o1.e - o2.e;
        });

        for(int i=0; i<list.size(); i++){
            Pos pos = list.get(i);
            dp[pos.e] = Math.min(dp[pos.e], dp[pos.s]+pos.l);
            for(int j = pos.e+1; j<=D; j++){
                dp[j] = Math.min(dp[j-1]+1, dp[j]);
            }
        }
        
        System.out.println(dp[D]);
    }
}
