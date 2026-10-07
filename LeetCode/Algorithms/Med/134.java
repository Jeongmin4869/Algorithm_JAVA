class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int idx = 0;
        int sum = 0;
        int total = 0;
        int N = gas.length;
        

        for(int i=0; i<N; i++){
            
            int diff = gas[i] - cost[i]; // 다음칸 이동 
            sum += diff;
            total += diff;
            
            if(sum < 0){
                //??
                idx = i+1;
            }
        }
        return total<0?-1:idx;
        
    }
}
