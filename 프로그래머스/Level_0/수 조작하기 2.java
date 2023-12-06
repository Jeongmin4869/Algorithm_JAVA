class Solution {
    public String solution(int[] numLog) {
        String[] arr = new String[21];
        arr[0] = "a";
        arr[9] = "s";
        arr[11] = "w";
        arr[20] = "d";
        String answer = "";
        for(int i=1; i<numLog.length; i++){
            answer += arr[numLog[i] - numLog[i-1] + 10];
        }
        
        return answer;
    }
}
