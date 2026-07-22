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
        for(int i=0; i<jobs.length; i++){
            pq.offer(new Node(i, jobs[i][0], jobs[i][1]));
        }
        
        int start = 0;
        int end = 0;
        while(!pq.isEmpty()){
            Node top =  pq.poll();
            start = Math.max(top.s, start);
            end = start + top.time;
            answer += end - start;
        }
        
        return answer/jobs.length;
    }
}
