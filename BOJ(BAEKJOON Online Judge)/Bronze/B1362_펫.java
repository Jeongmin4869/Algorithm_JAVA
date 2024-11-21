import java.util.*;
import java.io.*;

class Main_B1362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1; // 테스트 케이스 번호
        StringBuilder sb = new StringBuilder();

        while (true) {
            // 초기 체중과 원래 체중 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            int o = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            if (o == 0 && w == 0) break; // 종료 조건

            while (true) {
                st = new StringTokenizer(br.readLine());
                String c = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                if (c.equals("#")) break; // 종료 명령

                if (c.equals("F")) {
                    w += num; // 먹이를 먹음
                } else if (c.equals("E")) {
                    w -= num; // 운동을 함
                    if (w <= 0) break; // 체중이 0 이하로 떨어지면 즉시 종료
                }
            }

            // 결과 작성
            sb.append(count).append(". ");
            if (w <= 0) {
                sb.append("RIP");
            } else if (w > o / 2 && w < o * 2) {
                sb.append(":-)"); // 정상 체중
            } else {
                sb.append(":-("); // 비정상 체중
            }
            sb.append("\n");
            count++; // 다음 테스트 케이스 번호
        }

        System.out.print(sb); // 결과 출력
    }
}
