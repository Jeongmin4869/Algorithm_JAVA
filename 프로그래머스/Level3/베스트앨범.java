class Solution {
    
    public static class Node{
        int idx, count;
        Node(int idx, int count){
            this.idx = idx;
            this.count = count;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, List<Node>> map = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            String key = genres[i];
            List<Node> list;
            if(map.containsKey(key)){
                list = map.get(key);                
            }
            else {
                list = new ArrayList<>();                
            }
            list.add(new Node(i, plays[i]));
            map.put(key, list);
        }
        
        
        return answer;
    }
}
