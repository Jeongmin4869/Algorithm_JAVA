import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i:ingredient){
            if(!stack.empty() && stack.peek() == 1 && i == 2){stack.pop(); stack.push(12);}
            else if(!stack.empty() && stack.peek() == 12 && i == 3){stack.pop(); stack.push(123);}
            else if(!stack.empty() && stack.peek() == 123 && i == 1){stack.pop(); answer += 1;}
            else stack.push(i);
        }
        return answer;
    }
}
