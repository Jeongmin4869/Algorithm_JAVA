class Solution {
    public String longestPalindrome(String str) {
        int n = str.length();
        String answer = "" ;
        boolean[][] dp = new boolean[n][n];
        for(int i=0; i<n; i++){
            dp[i][i] = true;   
            answer = str.substring(i, i+1);         
        }

        for(int i=0; i<n-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                dp[i][i+1] = true;
                answer = str.substring(i, i+2);         
            }
        }

        for(int i=3; i<=n; i++){
            for(int s=0; s<=n-i; s++){
                int e = s+i-1;
                if(str.charAt(s) == str.charAt(e) && dp[s+1][e-1]){
                    dp[s][e] = true;
                    answer = str.substring(s, e+1);
                }
            }
        }
        return answer;
    }

}
