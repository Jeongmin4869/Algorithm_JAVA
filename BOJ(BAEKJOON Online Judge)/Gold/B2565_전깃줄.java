import java.util.*;
import java.io.*;

class Main_B2565 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[] {a, b});
        }

        Collections.sort(list, (o1, o2)->{
            return o1[0]-o2[0];
        });

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxcount = 0;
        for(int j=1; j<n; j++){
            int c = list.get(j)[1];
            for(int i=0; i<j; i++){
                int d = list.get(i)[1];
                if(d<c){
                    dp[j] = Math.max(dp[i]+1, dp[j]);
                    maxcount = Math.max(dp[j], maxcount);
                }
            }
        }      
        
        System.out.println(n-maxcount);
    }
}
