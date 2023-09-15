import java.util.*;

class Solution {

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("right") && (Math.abs(answer[0]) < board[0]/2 || answer[0] < 0)) answer[0] += 1;
            if(keyinput[i].equals("left") && (Math.abs(answer[0]) < board[0]/2 || answer[0] > 0)) answer[0] -= 1;
            if(keyinput[i].equals("up")  && (Math.abs(answer[1]) < board[1]/2 || answer[1] < 0)) answer[1] += 1;
            if(keyinput[i].equals("down")  && (Math.abs(answer[1]) < board[1]/2 || answer[1] > 0)) answer[1] -= 1;
        }
        
        return answer;
    }
}
