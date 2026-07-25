import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> maxpq = new PriorityQueue<>((o1, o2) -> {return o2 - o1;});       
        PriorityQueue<Integer> minpq = new PriorityQueue<>((o1, o2) -> {return o1 - o2;});    
        
        for(String str : operations){
            String[] arr = str.split(" ");
            int num = Integer.parseInt(arr[1]);
            if(arr[0].equals("I")){
                maxpq.offer(num);
                minpq.offer(num);
            }
            else {
                if(num == 1 && !maxpq.isEmpty()){
                    minpq.remove(maxpq.poll());
                }
                else if (num == -1 && !minpq.isEmpty()){
                    maxpq.remove(minpq.poll());
                }
            }
        }
                
        if(maxpq.isEmpty()) answer = new int[]{0,0};
        else answer = new int[]{maxpq.peek(), minpq.peek()};
        
        return answer;
    }
}

/*
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
                //if(map.getOrDefault(num, 0) == 0) continue;
                if(num == 1){                    
                    while(!maxpq.isEmpty() && map.getOrDefault(maxpq.peek(), 0) == 0){
            maxpq.poll();
        }
                    if(!maxpq.isEmpty()){
                        map.put(maxpq.peek(), map.get(maxpq.peek()) - 1);
                        maxpq.poll();
                    }
                }
                else {                    
                    while(!minpq.isEmpty() && map.getOrDefault(minpq.peek(), 0) == 0){
            minpq.poll();
        }
                    if(!minpq.isEmpty()){                        
                        map.put(minpq.peek(), map.get(minpq.peek()) - 1);
                        minpq.poll();
                    }
                }
            }
        }
        
        while(!maxpq.isEmpty() && map.getOrDefault(maxpq.peek(), 0) == 0){
            maxpq.poll();
        }
        
        while(!minpq.isEmpty() && map.getOrDefault(minpq.peek(), 0) == 0){
            minpq.poll();
        }
        
        if(maxpq.isEmpty()){
            answer = new int[]{0,0};
        }
        else {
            answer = new int[]{maxpq.peek(), minpq.peek()};
        }
        
        return answer;
    }
}
*/
