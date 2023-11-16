import java.util.stream.IntStream;

class Solution {
    public int solution(int[][] board, int k) {
        /*
        int answer = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(i+j <= k) answer += board[i][j];
            }
        }
        return answer;
        */

        return IntStream.range(0, board.length)
                    .filter(i -> i<=k)
                    .map(i -> IntStream.range(0, board[i].length)
                                .filter( j -> j + i <= k)
                                .map(j -> board[i][j])
                                .sum()
                        )
                    .sum();
        
    }
}
