class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int idx = 0;
        int sum = 0; // 현재 후보 출발점에서 지금까지 버틸 수 있는가?
        int total = 0; // 전체 정류장을 다 합쳤을 때 애초에 한 바퀴가 가능한가?
        int N = gas.length;
        

        for(int i=0; i<N; i++){
            
            int diff = gas[i] - cost[i]; // 다음칸 이동 
            sum += diff;
            total += diff;
            
            if(sum < 0){
                sum = 0;
                idx = i+1;
            }
        }
        return total<0?-1:idx;
        
    }
}
