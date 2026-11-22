class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2)->{
            return o1[1] - o2[1];
        });

        int count = 0 ;
        int N = intervals.length;
        int r = intervals[0][1];

        for(int i=1; i<N; i++){
            int a = intervals[i][0];
            int b = intervals[i][1];
            if(a < r) count += 1;
            else r = b;
        }

        return count;
    }
}
