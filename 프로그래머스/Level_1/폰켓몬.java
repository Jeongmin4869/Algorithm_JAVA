import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {

        int answer;
        
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i : nums){
            s.add(i);
        }
        
        answer = (s.size()< nums.length/2) ?s.size() : nums.length/2;
        return answer;
    }
}
