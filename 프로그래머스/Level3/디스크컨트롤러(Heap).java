import java.util.*;

class Solution {
    
    public static class Node implements Comparable<Node>{
        int idx;
        int s;
        int time;
        Node(int idx,int s, int time){
            this.idx = idx ;
            this.s = s;
            this.time = time;
        }
        
        public int compareTo(Node o){
            if(this.time == o.time) {
                if(this.s == o.s) {
                    return this.idx - o.idx;
                }   
                return this.s - o.s;
            }
            return this.time - o.time;
        }
    }
    
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Arrays.sort(jobs, (o1, o2) -> {
           return o1[0] - o2[0]; 
        });
        
        int idx = 0;
        int now = 0;
        while(idx<jobs.length || !pq.isEmpty()){
            
            while(idx<jobs.length && jobs[idx][0] <= now){
                pq.offer(new Node(idx, jobs[idx][0], jobs[idx][1]));
                idx += 1;
            }
            
            if(pq.isEmpty()){
                now = jobs[idx][0];
                continue;             
            }
            
            Node top = pq.poll();
            now += top.time;
            answer += now - top.s;
                
        }
        
        return answer/jobs.length;
    }
}
