class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[n+1][m+1];
        dp[1][1] = 1;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 && j==1) continue;
                if(check(i, j, puddles)) continue;
                dp[i][j] = (dp[i-1][j] + dp[i][j-1])%1000000007 ;
            }
        }
        
        answer = dp[n][m];
        
        return answer;
    }
    
    public static boolean check(int a, int b, int[][]puddles){
        for(int[] puddle : puddles){
            if(puddle[0] == b && puddle[1] == a) return true;
        }
        return false;
    }
}
