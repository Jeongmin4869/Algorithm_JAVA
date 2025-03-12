import java.util.*;
import java.io.*;

class Main_B2210 {

    static boolean[][] visited;
    static String[][] arr;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static Set<String> s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new String[5][5];
        s = new HashSet<>();
        
        for(int i=0; i<5; i++){
            arr[i] = br.readLine().split(" ");
        }

        visited = new boolean[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                dfs(i, j, arr[i][j]);
            }
        }

        
        System.out.println(s.size());
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
                //if(!visited[px][py]){
                //    visited[px][py] = true;
                    dfs(px, py, str+arr[px][py]);
                //    visited[px][py] = false;
                //}
            }
        }
        
    }
}
