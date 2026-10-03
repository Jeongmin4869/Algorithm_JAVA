class Solution {
    public int largestInteger(int n, int s) {
        int sum = 0;
        int num = 0;
        int nows = s;
        for(int i=0; i<n; i++){
            if(nows>=10){
                num += 9;
                sum += 9;
            }  
            else {
                num += nows;
                sum += nows;
                nows = 0;
            }
            if(i<n-1) num *= 10;
        }
    }
}