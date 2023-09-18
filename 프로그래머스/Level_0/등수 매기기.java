import java.util.stream.IntStream;
import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] lank = {};
        Map<Double, Integer> m = new TreeMap<>();
        lank = IntStream.range(0, score.length).mapToDouble(i -> (score[i][0]+score[i][1])/(2.0)).toArray();
        for(int i=0; i<lank.length; i++){
            m.put(lank[i], m.getOrDefault(lank[i], 0)+1);
        }
        
        int count = lank.length+1;
        for(Double key : m.keySet()) {
            
            count -= m.get(key);
            
            for(int i=0; i<lank.length; i++){
                if(key == lank[i])
                    answer[i] = count;
            }            
            
        }
        
        return answer;
    }
}
