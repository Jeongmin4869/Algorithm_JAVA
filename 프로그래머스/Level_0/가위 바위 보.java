import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public String solution(String rsp) {
        /*
        StringBuilder sb = new StringBuilder();
        String[] nums = {"5", "", "0", "", "", "2"}; // map 쓰기 싫어서 ... 
        for(int i=0; i<rsp.length(); i++){
            sb.append(nums[rsp.charAt(i)-'0']);
        }
        return sb.toString();
        */
        return Arrays.stream(rsp.split("")).map(i -> i.equals("2")?"0":i.equals("5")?"2":"5").collect(Collectors.joining());
        
    }
}
