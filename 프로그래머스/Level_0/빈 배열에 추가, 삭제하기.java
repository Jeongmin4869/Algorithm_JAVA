import java.util.Stack;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> s = new Stack<>();
        String str = "";
        for(int i=0; i<flag.length; i++){
            int count = 0;
            while(count < arr[i]){
                count+=1;
                if(flag[i]){
                    s.push(arr[i]);
                    s.push(arr[i]);
                }
                else {
                    s.pop();
                }
            }
        }
        int[] answer = new int[s.size()];
        for(int i=0; i<s.size(); i++){
            answer[i] = s.get(i);
        }
        return answer;
    }
}
