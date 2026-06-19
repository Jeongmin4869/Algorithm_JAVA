class Solution {
    static ArrayList<ArrayList<String>> g;
    static ArrayList<String> list;
    static boolean[] visited;
    public String[] solution(String[][] tickets) {
        
        g = new ArrayList<>();
        for(int i=0; i<tickets.length; i++){
            g.add(new ArrayList<>());
        }
        
        for(String[] arr : tickets){
            String a = arr[0];
            String b = arr[1];
            g.get(a).add(b);
            g.get(b).add(a);
        }
        
        visited = new visited[10001];
        
        bfs("ICN");
        
        return answer;
    }
    
    public static void bfs(String s){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add(s);
        
    }
}
