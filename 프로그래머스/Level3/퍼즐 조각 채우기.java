import java.util.*;

class Solution {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;
    static int N = 0;
    public int solution(int[][] game_board, int[][] table) {
        int answer = -1;
        N = game_board.length;
        visited = new boolean[N][N];
        List<List<int[]>>  boardspace = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(game_board[i][j] == 0 && !visited[i][j]){
                    boardspace.add(getShape(i, j, game_board, 0));
                }
            }
        }
        
        visited = new boolean[N][N];
        List<List<int[]>> tablespace = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(table[i][j] == 1 && !visited[i][j]){
                    tablespace.add(getShape(i, j,table, 1));
                }
            }
        }
        
        return answer;
    }
    
    public static List<int[]> getShape(int x, int y, int[][] map, int check){
        List<int[]> list = new ArrayList<>();
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});       
        visited[x][y] = true;
        while(!q.isEmpty()){
            int[] pos = q.poll();
            list.add(pos);
            int px = pos[0];
            int py = pos[1];
            for(int i=0; i<4; i++){
                int xx = px + dx[i];
                int yy = py + dy[i];
                if(xx>=0 && xx<N && yy>=0 && yy<N && map[xx][yy] == check && !visited[xx][yy]){
                    q.offer(new int[]{xx, yy});
                    visited[xx][yy] = true;
                }
            }            
        }
        return nomalize(list);
    }
    
    public static List<int[]> nomalize(List<int[]> shape){
        int minX = 50;
        int minY = 50;
        for(int[] p : shape){
            minX = Math.min(minX, p[0]);
            minY = Math.min(minY, p[1]);
        }
        
        List<int[]> result = new ArrayList<>();
        for(int[] p : shape){
            result.add(new int[]{p[0]-minX, p[1]-minY});
        }
        return result;
    }
}
