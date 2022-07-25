import java.util.Arrays; // sort
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer =  {};
        List<Integer> list = new ArrayList<Integer>();

        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] score = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(p1[i%p1.length] == answers[i]) score[0]++;
            if(p2[i%p2.length] == answers[i]) score[1]++;
            if(p3[i%p3.length] == answers[i]) score[2]++;
        }
        
        int max = 0;
        for(int s : score){
            if(s > max) max = s;
        }
        
        for(int i=0; i<score.length; i++){
            if(max == score[i]) list.add(i+1);
        }
        
        //List<Integer> -> int[]
        answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}
