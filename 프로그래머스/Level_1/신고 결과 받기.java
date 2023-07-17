import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] answer = new int[id_list.length];
        
        HashMap<String, Set<String>> users = new HashMap<>();
        Map<String, Integer> count = new LinkedHashMap<>();
        
        for(int i=0; i<report.length; i++){
            String[] arr = report[i].split(" ");
            Set<String> set = users.getOrDefault(arr[1], new HashSet<>());
            set.add(arr[0]);
            users.put(arr[1], set);
        }
        
        for(String id : id_list){
            count.put(id, 0);
        }
        
        for (Map.Entry<String, Set<String>> entry : users.entrySet()) {
            if(entry.getValue().size() >= k){
                for(String s : entry.getValue()){
                    count.put(s, count.get(s) + 1);
                }
            }
        }
        
        int idx = 0;
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            answer[idx++] = entry.getValue();
        }
       
        //return count.values().stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
