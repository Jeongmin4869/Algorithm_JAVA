//Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
    }
  }

class Solution {              
    public List<TreeNode> generateTrees(int n) {        
        return dfs(1, n);
    }

    public static List<TreeNode> dfs(int start, int end){        
        List<TreeNode> result = new ArrayList<>();
        if(start > end) {
            result.add(null);
            return result;
        };
    
        for(int root =start; root <=end; root++){
            // root가 부모 
            List<TreeNode> left = dfs(start, root-1);
            List<TreeNode> right = dfs(root+1, end);
            result.add(left);
            result.add(right);
        }
        return result;
    }
}
