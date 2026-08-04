class Solution {
    static int N = 0;
    static List<String> list;
    public List<String> generateParenthesis(int n) {
        N = n;
        list = new ArrayList<>();
        dfs("", 0, 0);
        return list;
    }

    public static void dfs(String cur, int open, int close){
        
        // 백트래킹
        if(close>open) return;
        
        if(close==N){
            list.add(cur);
            return;
        }

        if(open<N) dfs(cur+"(", open+1, close);
        if(close<N) dfs(cur+")", open, close+1);
    }
}
