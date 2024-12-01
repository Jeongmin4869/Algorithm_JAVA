import java.io.*;
import java.util.*;

class Main_B1730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        // 수평, 수직 이동 상태 기록 배열
        boolean[][] horizontal = new boolean[n][n];
        boolean[][] vertical = new boolean[n][n];
        
        String move = br.readLine();
        int x = 0, y = 0; // 시작 위치
        
        for (int i = 0; i < move.length(); i++) {
            char c = move.charAt(i);

            int nx = x, ny = y; // 다음 위치
            if (c == 'U') nx -= 1;
            if (c == 'D') nx += 1;
            if (c == 'L') ny -= 1;
            if (c == 'R') ny += 1;

            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;

            if (c == 'U' || c == 'D') {
                vertical[x][y] = true;
                vertical[nx][ny] = true;
            } else if (c == 'L' || c == 'R') {
                horizontal[x][y] = true;
                horizontal[nx][ny] = true;
            }

            x = nx;
            y = ny; // 다음 위치로 이동
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(vertical[i][j] && horizontal[i][j]){
                    sb.append("+");
                }
                else if(vertical[i][j]){
                    sb.append("|");
                }
                else if(horizontal[i][j]){
                    sb.append("-");
                }
                else {
                    sb.append(".");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
