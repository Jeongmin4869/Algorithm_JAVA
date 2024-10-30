import java.util.*;
import java.io.*;

class Main_B2580 {
    static int[][] maps = new int[9][9];
    static List<int[]> list = new ArrayList<>();
    static boolean solve = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=0; i<9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                maps[i][j] = Integer.parseInt(st.nextToken());
                if(maps[i][j] == 0) list.add(new int[] {i, j});
            }
        }

        dfs(0);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                sb.append(maps[i][j] + " ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);

    }

    static void dfs(int index){

        if(index == list.size()){
            solve = true;
            return;
        }

        int[] pos = list.get(index);
        int x = pos[0];
        int y = pos[1];
        
        for(int i=1; i<=9; i++){
            if(checkAll(x, y, i)){
                maps[x][y] = i;
                dfs(index+1);
                if (solve) return;  // 모든 빈칸을 채운 경우 종료
                maps[x][y] = 0; // 백트래킹
            }
        }
    }

    static boolean checkAll(int row, int col, int val){
        boolean flag;
                 flag = checkCol(col, val);
        if(flag) flag = checkRow(row, val);
        if(flag) flag = checkBox(row, col, val);

        return flag;
    }

    static boolean checkRow(int row, int val){
        for(int i=0; i<9; i++){
            if(maps[row][i]==val)
                return false;
        }
        
        return true;
    }
    
    static boolean checkCol(int col, int val){
        for(int i=0; i<9; i++){
            if(maps[i][col]==val)
                return false;
        }
        return true;
    }

    static boolean checkBox(int row, int col, int val){
        int x = row/3*3;
        int y = col/3*3;
        for(int i=x; i<x+3; i++){
            for(int j=y; j<y+3; j++){
                if(maps[i][j]==val) return false;
            }
        }
        return true;
    }
    
}
