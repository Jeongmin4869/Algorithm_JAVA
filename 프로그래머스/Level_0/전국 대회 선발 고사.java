/*

1. ArrayList

import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    // 선발 고사 등수를 담은 정수 배열 rank
    // 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance
    public int solution(int[] rank, boolean[] attendance) {
        int[] sorted = rank.clone();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(sorted);
        for(int i=0; i<sorted.length; i++){
            for(int j=0; j<rank.length; j++){
                if(sorted[i] == rank[j] && attendance[j]){
                    list.add(j);
                    break;
                }
            }
            if(list.size() == 3) break;
        }
        
        return list.get(0) * 10000 + list.get(1) * 100 + list.get(2);
    }
}
*/

/*

2. PriorityQeueu
import java.util.PriorityQueue;

class Solution {
    // 선발 고사 등수를 담은 정수 배열 rank
    // 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance
    public int solution(int[] rank, boolean[] attendance) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> rank[a] - rank[b]);
        
        for(int i=0; i<rank.length; i++){
            if(attendance[i])
                q.add(i); 
        }
        
        return q.poll()*10000 + q.poll() * 100 + q.poll();
    }
}

*/

// 3. Stream

import java.util.stream.IntStream;
import java.util.Comparator;

class Solution {
    // 선발 고사 등수를 담은 정수 배열 rank
    // 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance
    public int solution(int[] rank, boolean[] attendance) {
     
        return IntStream.range(0, rank.length)
               .filter(i -> attendance[i])
               .boxed()
               .sorted(Comparator.comparing(i -> rank[i]))
               .limit(3)
               .reduce((current, next) -> current * 100 + next)
               .get();
                   
    }
}
