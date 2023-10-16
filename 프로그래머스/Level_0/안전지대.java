class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[][] safe = new int[n][n]; // 배열은 0으로 초기화
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    
                    safe[i][j] = 1;
                    
                    if(i>0){
                      if(j>0)   safe[i-1][j-1] = 1;
                      if(j<n-1) safe[i-1][j+1] = 1;
                      safe[i-1][j] = 1;
                    }
                    
                    if(i<n-1){
                      if(j>0)   safe[i+1][j-1] = 1;
                      if(j<n-1) safe[i+1][j+1] = 1;
                      safe[i+1][j] = 1;
                    }
                    
                    if(j>0)   safe[i][j-1] = 1;
                    if(j<n-1) safe[i][j+1] = 1;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(safe[i][j] == 0) answer += 1;
            }        
        }
        
        return answer;
    }
}
