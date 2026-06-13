class Solution {
    static boolean visited[];
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                answer += 1;
                dfs(i, computers);
            }
        }
        
        return answer;
    }
    
    public static void dfs(int x, int[][] map){
        visited[x] = true;
        
        for(int i=0; i<map[x].length; i++){
            if(!visited[i] && map[x][i] == 1){
                dfs(i, map);
            }
        }
        
    
    }
}
