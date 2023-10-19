class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        String vec = "right";        
        int count = 1;
        
        int row = 0, col = 0;
        
        while(count <= n*n){
            
            answer[row][col] = count++;
            if(vec.equals("right")){
                if(col == n-1 || answer[row][col+1] != 0){
                    vec = "down";
                    row += 1;
                }
                else {
                    col += 1;
                }
            }
            else 
            if(vec.equals("down")){
                if(row == n-1 || answer[row+1][col] != 0){
                    vec = "left";
                    col -= 1;
                }
                else {
                    row += 1;
                }
            }
            else
            if(vec.equals("left")){
                if(col == 0 || answer[row][col-1] != 0){
                    vec = "up";
                    row -= 1;
                }
                else {
                    col -= 1;
                }
            }
            else
            if(vec.equals("up")){
                if(row == 0 || answer[row-1][col] != 0){
                    vec = "right";
                    col += 1;
                }
                else {
                    row -= 1;
                }
            }
        }
        
        return answer;
    }
}
