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
