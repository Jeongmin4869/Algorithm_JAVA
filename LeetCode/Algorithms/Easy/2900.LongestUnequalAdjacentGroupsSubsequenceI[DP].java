class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        int maxidx = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(groups[i] != groups[j] && dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                    prev[i] = j;
                }
            }

            if(dp[i] > dp[maxidx]){
                maxidx = i;
            }            
        }

        List<String> list = new ArrayList<>();        
        while(maxidx!=-1){
            list.add(words[maxidx]);
            maxidx = prev[maxidx];
        }
        
        Collections.reverse(list);
        return list;
    }
}
