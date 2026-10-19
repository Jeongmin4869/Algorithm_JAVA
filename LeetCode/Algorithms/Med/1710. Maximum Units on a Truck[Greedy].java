class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (o1, o2) -> {
            return o2[1] - o1[1];
        });

        int sum = 0;
        for(int i=0; i<boxTypes.length; i++){
            int num = boxTypes[i][0];
            int size = boxTypes[i][1];
            
            int min = Math.min(num, truckSize);
            truckSize -= min;
            sum += (min * size);
            
            if(truckSize == 0) break;
        }
        return sum;
    }
}
