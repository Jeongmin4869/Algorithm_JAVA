class Solution {
    public int matrixScore(int[][] grid) {
        int score = 0;
        int N = grid.length;
        int M = grid[0].length;
        int sum = 0;

        // 각 행의 첫 번째 값이 0이면 행 전체를 뒤집어
        // 가장 높은 자리의 비트를 1로 만든다.
        for (int i = 0; i < N; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < M; j++) {
                    grid[i][j] = (grid[i][j] + 1) % 2;
                }
            }
        }

        // 첫 번째 열은 모든 값이 1이므로 점수에 반영한다.
        sum += Math.pow(2, M - 1) * N;

        // 두 번째 열부터 각 열을 확인한다.
        for (int i = 1; i < M; i++) {
            int zero = 0;
            int one = 0;

            // 현재 열의 0과 1 개수를 센다.
            for (int j = 0; j < N; j++) {
                if (grid[j][i] == 1) one += 1;
                else zero += 1;
            }

            // 열을 뒤집을 수 있으므로 0과 1 중 더 많은 쪽을 선택한다.
            // 해당 열의 자리값에 1의 개수를 곱해 점수에 더한다.
            sum += Math.pow(2, M - i - 1) * Math.max(zero, one);
        }

        return sum;
    }
}
