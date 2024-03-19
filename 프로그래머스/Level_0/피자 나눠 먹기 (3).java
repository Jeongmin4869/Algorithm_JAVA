class Solution {
    public int solution(int slice, int n) {
        //return (int)Math.ceil((double)n/slice);
        return n%slice>0?n/slice+1:n/slice;
    }
}
