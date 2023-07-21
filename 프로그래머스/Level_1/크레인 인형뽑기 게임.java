import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
        for(int i=0; i<moves.length; i++){
            int target = moves[i]-1;
            for(int j=0; j<board.length; j++){
                if(board[j][target] > 0){
                    if(stack.empty()) {
                        stack.push(board[j][target]);
                        board[j][target] = 0;
                        break;
                    }            
                    if(stack.peek() == board[j][target]){
                        stack.pop();
                        answer += 2;
                    }
                    else {
                        stack.push(board[j][target]);
                    }
                    board[j][target] = 0;
                    break;
                }
            }
        }
    
        return answer;
    }
}
