import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, M;
    static int[] dx = { 0, 1, 0, -1};
    static int[] dy = { 1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
        String[][] map = new String[N][M];
        for(int i=0; i<N; i++){
            map[i] = br.readLine().split(" ");
        }

        int result = 0;
        for(int i=0; i<N*M-3; i++){
            if(!map[i/M][i%M].equals("0") ) continue;
            map[i/M][i%M] = "1";
            
            for(int j=i+1; j<N*M-2 ;j++){
                if(!map[j/M][j%M].equals("0")) continue;
                map[j/M][j%M] = "1";
                
                for(int k=j+1; k<N*M-1 ;k++){
                    if(!map[k/M][k%M].equals("0")) continue;
                                 
                    map[k/M][k%M] = "1";
                    int count = act(map);
                    result = Math.max(count, result);
                    map[k/M][k%M] = "0";
                }
                map[j/M][j%M] = "0";
            }
            map[i/M][i%M] = "0";
        }

        
        System.out.println(result);
    }

    public static int act(String[][] map){

        String[][] newmap = new String[N][M];
        for(int i=0; i<N; i++){
            newmap[i] = map[i].clone();
        }

        
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(newmap[i][j].equals("2"))
                    dfs(i, j, newmap);
            }
        }
        return counting(newmap);
    }
    
    public static int counting(String[][] newmap){
        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(newmap[i][j].equals("0"))
                    count += 1;
            }
        }
        return count;
    }
    
    public static void dfs(int x, int y, String[][] newmap){        
        for(int i=0; i<4; i++){
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(xx >= 0 && xx < N && yy >= 0 && yy < M &&  newmap[xx][yy].equals("0")){
                newmap[xx][yy] = "2";
                dfs(xx, yy, newmap);
            }
        }
    }
}
