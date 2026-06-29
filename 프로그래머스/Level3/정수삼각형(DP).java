class Solution {
    public int solution(int[][] triangle) {
        int N = triangle.length;
        for(int i=1; i<N; i++){
            for(int j=0; j<N-i; j++){
                triangle[N-i-1][j] += Math.max( triangle[N-i][j],triangle[N-i][j+1]);
            }
        }
        
        return triangle[0][0];
    }
}
