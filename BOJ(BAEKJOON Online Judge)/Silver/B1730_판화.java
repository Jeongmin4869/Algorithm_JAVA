import java.io.*;
import java.util.*;

class Main_B1730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        
        // 격자를 '.'으로 초기화
        for (int i = 0; i < n; i++) Arrays.fill(arr[i], '.');
        
        String move = br.readLine();
        int x = 0, y = 0; // 시작 위치
        
        for (int i = 0; i < move.length(); i++) {
            char c = move.charAt(i);

            int nx = x, ny = y; 
            if (c == 'U') nx -= 1;
            if (c == 'D') nx += 1;
            if (c == 'L') ny -= 1;
            if (c == 'R') ny += 1;

            // 격자 범위를 벗어나면 무시
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;

            if (c == 'U' || c == 'D') {
                arr[x][y] = (arr[x][y] == '-') ? '+' : '|';
                arr[nx][ny] = (arr[nx][ny] == '-') ? '+' : '|';
            } else if (c == 'L' || c == 'R') {
                arr[x][y] = (arr[x][y] == '|') ? '+' : '-';
                arr[nx][ny] = (arr[nx][ny] == '|') ? '+' : '-';
            }

            x = nx;
            y = ny; // 다음 위치로 이동
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}
