class Solution {
    public int minimumMoves(String s) {
        int count = 0;
        int N = s.length();
        for(int i=0; i<N; i++){
            if(s.charAt(i)=='X'){
                count += 1;
                i += 2;
            }
        }
        return count;
    }
}