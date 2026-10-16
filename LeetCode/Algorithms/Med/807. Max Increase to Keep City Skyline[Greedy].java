class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int N = grid[0].length;
        int[] hmaxs = new int[N];
        int[] vmaxs = new int[N];

        int sum = 0;
        for(int i=0; i<N; i++){
            int hmax = 0;
            int vmax = 0;            
            for(int j=0; j<N; j++){
                hmax = Math.max(grid[i][j], hmax);
                vmax = Math.max(grid[j][i], vmax);
            }
            hmaxs[i] = hmax;
            vmaxs[i] = vmax;
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                int max = Math.min(hmaxs[i], vmaxs[j]);
                int now = grid[i][j];
                if(max>now) sum += max-now;
            }
        }

        return sum;
    }
}
