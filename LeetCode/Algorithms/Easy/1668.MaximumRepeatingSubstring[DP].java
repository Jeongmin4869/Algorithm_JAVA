class Solution {
    public int maxRepeating(String sequence, String word) {        
        int size = sequence.length();
        int n = word.length(); 
        int[] dp = new int[size+1];
        int max = 0;
        for(int i=0; i<=size-n; i++){
            String str = sequence.substring(i, i+n);
            if(str.equals(word)){
                dp[i+n] = dp[i] + 1;
                max = Math.max(dp[i+n], max);
            }
        }
        return max;
    }
}
