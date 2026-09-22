class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int N = arr.length;
        int stand = 0;
        for(int num : arr){
            stand += num;
        }

        if(stand % 3 != 0) return false;
        stand /= 3;

        int now = 0;
        int count = 0;
        for(int i=0; i<N; i++){
            now += arr[i];
            if(now == stand){
                count += 1;
                now = 0;
            }
        }
        return count>=3?true:false;
    }
}
