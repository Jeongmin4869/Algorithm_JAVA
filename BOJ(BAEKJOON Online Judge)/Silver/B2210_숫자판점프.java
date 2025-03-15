import java.util.*;
import java.io.*;

class Main_B2210 {
    
    static String[][] arr;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static Set<String> s;

    static class Node{
        int x, y;
        String str;
        Node (int x, int y, String str){
            this.x = x;
            this.y = y;
            this.str = str;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new String[5][5];
        s = new HashSet<>();
        
        for(int i=0; i<5; i++){
            arr[i] = br.readLine().split(" ");
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                bfs(i, j, arr[i][j]);
            }
        }

        
        System.out.println(s.size());
    }

    public static void bfs(int x, int y, String str){
        Queue<Node> q = new LinkedList<>();
        Node node = new Node(x, y, str);
        q.offer(node);
        
        while(!q.isEmpty()){
            Node now = q.poll();
            int nx = now.x;
            int ny = now.y;
            String nStr = now.str;

            if(nStr.length() == 6){
                s.add(nStr);
                continue;
            }
            
            for(int i=0; i<4; i++){
                int xx = nx + dx[i];
                int yy = ny + dy[i];
                if(xx >= 0 && xx < 5 && yy >= 0 && yy < 5){
                    q.offer(new Node(xx, yy, nStr + arr[xx][yy]));                    
                }
                
            }
        }        
    }

    
    public static void dfs(int x, int y, String str){
        if(str.length() == 6){
            s.add(str);
            return;
        }

        for(int i=0; i<4; i++){
            int px = dx[i] + x;
            int py = dy[i] + y;
            if(px>=0 && px<5 && py>=0 && py<5){                
                dfs(px, py, str+arr[px][py]);                
            }
        }
        
    }
}
