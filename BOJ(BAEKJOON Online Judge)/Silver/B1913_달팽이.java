import java.io.*;

public class Main_B1913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        // 방향: 상(0), 우(1), 하(2), 좌(3)
        int[] dx = {-1, 0, 1, 0}; 
        int[] dy = {0, 1, 0, -1}; 

        int x = N / 2, y = N / 2; 
        int num = 1, step = 1; // 현재 숫자, 이동할 거리
        int dir = 0; // 방향 인덱스
        int targetX = 0, targetY = 0; // M의 위치 저장 변수

        arr[x][y] = num++; // 중앙에 1 배치

        outer: // (break 사용을 위한 레이블)
        while (num <= N * N) {
            for (int i = 0; i < 2; i++) { // 같은 거리만큼 두 번 이동
                for (int j = 0; j < step; j++) {
                    x += dx[dir];
                    y += dy[dir];
                    arr[x][y] = num ++;
                    if (num > N * N) break outer; // 모든 숫자 배치 완료 시 종료
                }
                dir = (dir + 1) % 4; // 방향 전환
            }
            step++; 
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int now = arr[i][j];
                // 출력문 수정 -> 통과
                if (now == M) {
                        targetX = i + 1;
                        targetY = j + 1;
                }
                sb.append(now + " ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
        System.out.println(targetX + " " + targetY);
    }
}
