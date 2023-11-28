
class Solution {
    public int solution(int num, int k) {
        /*
        String numstr = Integer.toString(num);
        int answer = numstr.indexOf(Integer.toString(k));
        return answer!=-1?answer+1:answer;
        */
        return ("_"+num).indexOf(Integer.toString(k));
    }
}
