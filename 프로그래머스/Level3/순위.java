class Solution {

    static int[][] f;
    public int solution(int n, int[][] results) {
        int answer = 0;
        f = new int[n+1][n+1];
        for(int i=0; i<=results.length; i++){
            for(int j=0; j<2; j++){
                f[i][j] = 1;
                f[j][i] = -1;
            }
        }

        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                for(int k=0; k<=n; k++){
                    if(f[i][k] == 1 && f[k][j] == 1){
                        f[i][j] = 1;
                        f[j][i] = -1;
                    }
                    if(f[i][k] == -1 && f[k][j] == -1){
                        f[i][j] = -1;
                        f[j][i] = 1;
                    }
                }
            }
        }
        
        for(int i=0; i<=n; i++){
            int count = 0;
            for(int j=0; j<=n; j++){
                if(f[i][j] != 0) count += 1;
            }
            if(count == n-1) answer += 1;
        }
        
        return answer;
    }
}
