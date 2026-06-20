import java.util.*;

class Solution {
    static ArrayList<String> path;
    static boolean[] visited;    
    static String[] answer; 
    
    public String[] solution(String[][] tickets) {
        
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
        
        visited = new boolean[tickets.length];
        path = new ArrayList<>();
        
        path.add("ICN");
        dfs("ICN", 0, tickets);
        
        return answer;
    }
    
    public static void dfs(String s, int depth, String[][] tickets){
        if(answer != null) return ;
        
        if(depth == tickets.length){
            answer = path.toArray(new String[0]);
            return;
        }
        
        for(int i=0; i<tickets.length; i++){
            if(!visited[i] && tickets[i][0].equals(s)){
                visited[i] = true;
                path.add(tickets[i][1]);
                dfs(tickets[i][1], depth+1, tickets);
                // 백트래킹
                path.remove(path.size()-1);               
                visited[i] = false;
            }
        }
    }
}
