// AI 활용 주석
import java.util.*;

class Solution {
    public int solution(int N, int number) {

        // dp[i] : N을 정확히 i개 사용해서 만들 수 있는 모든 숫자
        Set<Integer>[] dp = new HashSet[9];

        // N을 1개부터 8개까지 사용하는 경우를 모두 탐색
        for(int i = 1; i <= 8; i++) {

            // 각 dp[i]를 HashSet으로 초기화
            // HashSet을 사용하는 이유는 같은 숫자가 여러 번 만들어질 수 있기 때문
            dp[i] = new HashSet<>();

            // N을 이어붙인 숫자 생성
            // i=1 -> 5
            // i=2 -> 55
            // i=3 -> 555
            int num = 0;
            for(int j = 0; j < i; j++) {
                num = num * 10 + N;
            }

            // 이어붙인 숫자 추가
            dp[i].add(num);

            // N을 i개 사용하는 방법은
            // j개 + (i-j)개 사용하는 모든 조합이다.
            //
            // 예)
            // i=4
            // dp[1] + dp[3]
            // dp[2] + dp[2]
            // dp[3] + dp[1]
            for(int j = 1; j < i; j++) {

                // N을 j개 사용해서 만들 수 있는 숫자 하나 선택
                for(int a : dp[j]) {

                    // N을 (i-j)개 사용해서 만들 수 있는 숫자 하나 선택
                    for(int b : dp[i-j]) {

                        // 사칙연산 결과를 모두 저장
                        dp[i].add(a + b);
                        dp[i].add(a - b);
                        dp[i].add(a * b);

                        // 0으로 나누는 경우는 예외가 발생하므로 제외
                        if(b != 0) {
                            dp[i].add(a / b);
                        }
                    }
                }
            }

            // number가 만들어졌다면
            // 현재 i가 최소 사용 횟수이므로 바로 반환
            if(dp[i].contains(number))
                return i;
        }

        // 8개까지 사용해도 만들 수 없는 경우
        return -1;
    }
}
