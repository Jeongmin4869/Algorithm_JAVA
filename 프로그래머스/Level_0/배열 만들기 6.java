import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        int i=0;
        while(i<arr.length){
            if(stack.size() == 0) stack.push(arr[i]);
            else if(stack.peek() == arr[i]) stack.pop();
            else if(stack.peek() != arr[i]) stack.push(arr[i]);
            
            i += 1;
        }
        
        if(stack.size() == 0) return new int[]{-1};
        
        answer = new int[stack.size()];
        
        for(int j=stack.size()-1; j>=0; j--){
            answer[j] = stack.peek();
            stack.pop();
        }
        
        return answer;
    }
}
