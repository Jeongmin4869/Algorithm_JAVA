class Solution {

    public class Node implements Comparable<Node>{
        char c ;
        int count ;
        Node(char c, int count){
            this.c = c;
            this.count = count;
        }

        public int compareTo(Node o){
            return Integer.compare(o.count , this.count);
        }
    }

    public String reorganizeString(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        for(char key : m.keySet()){
            pq.offer(new Node(key, m.get(key)));
        }
        
        StringBuilder sb = new StringBuilder();
        Node prev = new Node('.', 0) ;
        while(!pq.isEmpty()){
            Node top = pq.poll();
            if(prev.c != top.c){
                top.count -= 1;
                sb.append(top.c);
                if(prev.count > 0) pq.offer(prev);
                prev = top;
            }
            else {
                pq.offer(prev);
                break;
            }                    
        }

        if(prev.count > 0) return "";
        return sb.toString();
    }
}
