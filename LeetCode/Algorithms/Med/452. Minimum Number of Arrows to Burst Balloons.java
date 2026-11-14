class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (o1, o2) -> {
            if(o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
            return Integer.compare(o1[0], o2[0]);
        });

        int count = 0;
        long max = points[0][1];

        for(int i=1; i<points.length; i++){
            if(max < points[i][0]){
                count += 1;
                max = points[i][1];
            }        
        }
        return count + 1;
    }
}
