import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> maxpq = new PriorityQueue<>((o1, o2) -> {return o2 - o1;});       
        PriorityQueue<Integer> minpq = new PriorityQueue<>((o1, o2) -> {return o1 - o2;});    
        Map<Integer, Integer> map = new HashMap<>();
        
        for(String str : operations){
            String[] arr = str.split(" ");
            int num = Integer.parseInt(arr[1]);
            if(arr[0].equals("I")){
                maxpq.offer(num);
                minpq.offer(num);
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            else {
                if(num == 1){
                    if()
                }
                else {
                    maxpq.poll();
                }
            }
        }
        
        int max = maxpq.poll();
        int min = minpq.poll();
        if(max == min) {max = 0; min = 0;}
        answer[0] = max;
        answer[1] = min;
        return answer;
    }
}
