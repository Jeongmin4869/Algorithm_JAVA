/*
class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        int answer = 0;
        int min = 200, max = 0;
        for(int i=0; i<lines.length; i++){
            for(int j=lines[i][0]; j<lines[i][1]; j++){
                arr[(j+2+j)/2+100] += 1; // 두 간선의 중간값
            }
        }
        
        for(int i=0; i<201; i++){
            if(arr[i] > 1) answer += 1;
        }
        
        return answer;
    }
}
*/
import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] line : lines){
            int min = Math.min(line[0], line[1]);
            int max = Math.max(line[0], line[1]);
            for(int i=min; i<max; i++){
                map.merge(i, 1, Integer::sum);
            }
        }
        return (int)map.values().stream().filter(i -> i>1).count();
    }
}
