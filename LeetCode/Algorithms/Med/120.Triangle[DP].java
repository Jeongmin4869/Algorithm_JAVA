class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = triangle.get(0).get(0);

        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                int num = triangle.get(i).get(j);                
                if(j>0) dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]) + num;
                else dp[i][j] = dp[i-1][j] + num;
            }
        }

        int answer = Integer.MAX_VALUE;
        for(int num : dp[n-1]){
            answer = Math.min(answer, num);
        }

        return  answer;
    }
}
