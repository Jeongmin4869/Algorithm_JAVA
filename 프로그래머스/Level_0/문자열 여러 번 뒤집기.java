class Solution {

    public String solution(String my_string, int[][] queries) {
        String std = my_string;
        // 주어진 문자열을 문자 어레이로 변환
        char[] chars = std.toCharArray();
        
        for(int i=0; i<queries.length; i++){

            int start = queries[i][0];
            int end = queries[i][1];
            
            for(int j = start; j<end; j++){
                chars[j] = std.charAt(end);
                chars[end] = std.charAt(j);
                end--;
            }
            // 문자 어레이을 다시 문자열로 변환
            std = String.valueOf(chars);
        }
        
        
        return std;
    }
}
