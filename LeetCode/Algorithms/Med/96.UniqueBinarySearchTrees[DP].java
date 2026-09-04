class Solution {

    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            for(int root=1; root<=i; root++){
                int left = root-1;
                int right = i-root;
                dp[i] += dp[left]*dp[right];
            }
        }
        return dp[n];
    }

}
/*
class Solution {

    public int numTrees(int n) {
        return dfs(1, n);
    }

    public static int dfs(int s, int e){
        int count = 0;
        if(s > e){            
            return 1;
        }

        for(int root = s; root<=e; root++){
            int leftc = dfs(s, root-1);
            int rightc = dfs(root+1, e);
            count += leftc*rightc;
        }
        return count ;
    }
    

}
*/
