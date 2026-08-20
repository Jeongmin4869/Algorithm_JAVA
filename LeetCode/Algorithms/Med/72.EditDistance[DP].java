class Solution {
    public int minDistance(String word1, String word2) {
        int N = word1.length();
        int M = word2.length();
        int[][] dp = new int[N+1][M+1];

        for(int i=1; i<=N; i++){
            dp[i][0] = dp[i-1][0] + 1;
        }

        for(int i=1; i<=M; i++){
            dp[0][i] = dp[0][i-1] + 1;
        }

        for(int i=1; i<=N; i++){
            char a = word1.charAt(i-1);
            for(int j=1; j<=M; j++){
                char b = word2.charAt(j-1);
                if(a==b) dp[i][j] = dp[i-1][j-1]; // 변화없음 
                else {
                    // dp[i-1][j] : 글자삭제
                    // dp[i][j-1] : 글자추가 
                    // dp[i-1][j-1] : 글자교체
                    dp[i][j] = Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1])) + 1;
                }
            }

            
        }
        return dp[N][M];
    }
}
