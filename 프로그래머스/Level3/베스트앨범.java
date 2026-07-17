import java.util.*;
import java.io.*;

class Solution {
    
    public static class Node{
        int idx, time;
        Node(int idx, int time){
            this.idx = idx;
            this.time = time;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String, List<Node>> map = new HashMap<>();
        Map<String, Integer> playtime = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            String key = genres[i];
            List<Node> list;
            if(map.containsKey(key)){
                list = map.get(key);                              
            }
            else {
                list = new ArrayList<>();
                playtime.put(key,0);
            }
            list.add(new Node(i, plays[i]));
            playtime.put(key, playtime.get(key) + plays[i]);
            map.put(key, list);
        }

        List<String> keylist = new ArrayList<>(playtime.keySet());
        Collections.sort(keylist, (o1, o2) -> {
            return playtime.get(o2) - playtime.get(o1);
        });
        
        
        for(String genre : keylist){
            List<Node> list = map.get(genre);
            Collections.sort(list, (o1, o2) -> {
                if(o2.time == o1.time ) return o1.idx - o2.idx ;
                return o2.time - o1.time ;
            });
            for(int i=0; i<2; i++){
                answer.add(list.get(i).idx);                
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
