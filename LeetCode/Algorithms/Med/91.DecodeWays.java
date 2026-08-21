class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        if(n>=1) {
            if(s.charAt(0) != '0') dp[0] = 1;
        }
        if(n>=2) {
            dp[1] += dp[0] ;
            if(s.charAt(0) != '0' && Integer.parseInt(s.substring(0, 2))<=26){
                dp[1] += 1;
            }
        }

        for(int i=2; i<n; i++){
            if(s.charAt(i) != '0') dp[i] += dp[i-1];
            String str = s.substring(i-1, i+1);
            if(str.charAt(0) != '0' && Integer.parseInt(str)<=26){
                dp[i] += dp[i-2];
            }
        }
        return dp[n-1];
    }
}
