import java.util.*;

class Solution {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;
    static boolean[] used;
    static int N = 0;
    public int solution(int[][] game_board, int[][] table) {

        N = game_board.length;
        visited = new boolean[N][N];
        List<List<int[]>>  boardspaces = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(game_board[i][j] == 0 && !visited[i][j]){
                    boardspaces.add(getShape(i, j, game_board, 0));
                }
            }
        }
        
        visited = new boolean[N][N];
        List<List<int[]>> tablespaces = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(table[i][j] == 1 && !visited[i][j]){
                    tablespaces.add(getShape(i, j,table, 1));
                }
            }
        }
        
        used = new boolean[tablespaces.size()];
        
        int count = 0;
        for(List<int[]> boardspace : boardspaces){
            boolean matched = false;
            for(int i=0; i<tablespaces.size(); i++){
                if(used[i]) continue;
                List<int[]> tablespace = tablespaces.get(i);      
                for(int j=0; j<4; j++){
                    if(isSame(boardspace, tablespace)){
                        count += tablespace.size();
                        used[i] = true;
                        matched = true;
                        break;
                    }
                    tablespace = rotate(tablespace);
                }
                if(matched) break;
            }
        }
        
        return count;
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
        
        // java8이상
        result.sort((o1, o2) -> {
            if(o1[0] == o2[0])
                return o1[1] - o2[1];
            return o1[0] - o2[0];
        });
        
        return result;
    }
    
    // 90도 회전
    public static List<int[]> rotate(List<int[]> list){
        List<int[]> result = new ArrayList<>();
        for(int[] p : list){
            result.add(new int[]{p[1], p[0]*-1});
        }
        return nomalize(result);
    }
    
    public static boolean isSame(List<int[]> a, List<int[]> b){
        if(a.size() != b.size()) return false;
        for(int i=0; i<a.size(); i++){
            if(a.get(i)[0] != b.get(i)[0]) return false;
            if(a.get(i)[1] != b.get(i)[1]) return false;
        }
        return true;
    }
}
