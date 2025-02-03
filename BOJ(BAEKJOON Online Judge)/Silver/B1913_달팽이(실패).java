import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        int[] dx = {-1, 0, 1, 0};
        int[] dy = { 0, 1, 0, -1};

        int rx = 0, ry = 0;        
        int now = 1, lotate = 0, pluscount = 1;
        int nx = N / 2, ny = N / 2;
        arr[nx][ny] = now++;

        outer:
        while (now <= N * N) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < pluscount; j++) {
                    if (now > N * N) break outer;
                    
                    nx += dx[lotate];
                    ny += dy[lotate];
                    arr[nx][ny] = now;

                    if (now == M) {
                        rx = nx + 1;
                        ry = ny + 1;
                    }

                    now++;
                }
                lotate = (lotate + 1) % 4;
            }

            pluscount++;

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        sb.append(rx).append(" ").append(ry);
        System.out.println(sb.toString());
    }
}
