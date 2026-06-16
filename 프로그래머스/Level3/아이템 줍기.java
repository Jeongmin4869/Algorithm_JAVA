import java.util.*;

class Solution {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;
    static int[][] map;
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
                
        int answer = 0;
        
        map = new int[102][102];
        visited = new boolean[102][102];
        
        for(int[] pos : rectangle){
            int x1 = pos[0]*2;
            int y1 = pos[1]*2;
            int x2 = pos[2]*2;
            int y2 = pos[3]*2;
            for(int i=x1; i<=x2; i++){
                for(int j=y1; j<=y2; j++){
                    map[i][j] = 1;
                }
            }
        }
        
        map[itemX*2][itemY*2] = 2;
        
        answer = bfs(characterX*2, characterY*2);
        
        return answer;
    }
    
    public static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y, 0});
        visited[x][y] = true;
        while(!q.isEmpty()){
            int[] pos = q.poll();
            int nx = pos[0];
            int ny = pos[1];
            int dis = pos[2];
            
            if(map[nx][ny] == 2) return dis/2;
            
            for(int i=0; i<4; i++){
                int xx = nx + dx[i];
                int yy = ny + dy[i];
                if(xx>=0 && xx<102 && yy>=0 && yy<102 && !visited[xx][yy] && map[xx][yy] > 0 && check(xx, yy)){
                    visited[xx][yy] = true;
                    q.offer(new int[]{xx, yy, dis+1});
                }
            }
        }
        return 0;
    }
    
    public static boolean check(int x, int y){
        
        for(int i=0; i<4; i++){
            int xx = x+dx[i];
            int yy = y+dy[i];
            if(xx>=0 && xx<102 && yy>=0 && yy<102){
                if(map[xx][yy] == 0) return true;
            }
        }
        return false;
        
    }
}
