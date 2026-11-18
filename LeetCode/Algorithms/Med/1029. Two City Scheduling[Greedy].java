class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (o1, o2) -> {
            return Integer.compare(o1[0]-o1[1], o2[0]-o2[1]);
        });

        int N = costs.length;
        int result = 0;
        for(int i=0; i<N/2; i++){
            result += costs[i][0];
            result += costs[N-i-1][1];
        }
        return result;
    }  
}
