class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        String str = ineq + eq;
        
        if(str.equals(">="))
            return n>=m?1:0;
        
        if(str.equals("<="))
            return n<=m?1:0;
        
        if(str.equals(">!"))
            return n>m?1:0;
        
        if(str.equals("<!"))
            return n<m?1:0;
        
        return answer;
    }
}
