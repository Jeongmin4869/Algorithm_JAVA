import java.util.*;

class Solution {
    static boolean[] visited;
    
    static class Node{
        String word;
        int count;
        Node(String word, int count){
            this.word = word;
            this.count = count;
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        visited = new boolean[words.length];
        if(!Arrays.asList(words).contains(target)) return 0;
        
        if(!begin.equals(target)){
            answer = bfs(begin,target, 0, words);
        }
        
        return answer;
    }
    
    public static int bfs(String begin, String target, int count, String[] words){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(begin, count));
        while(!q.isEmpty()){
            Node top = q.poll();
            String nowword = top.word;
            int nowcount = top.count;
            if(nowword.equals(target)) return nowcount;
            
            for(String word : words){
                int diff = 0;
                for(int i=0; i<nowword.length(); i++){
                    if(nowword.charAt(i) != word.charAt(i))
                        diff += 1;
                }
                
                if(diff == 1)
                    q.offer(new Node(word, nowcount+1));
            }
        }
        return 0;
        
    }
}
