class Solution {
    public int largestInteger(int n, int s) {                
        StringBuilder sb = new StringBuilder();       
        for(int i=0; i<n; i++){
            int digit = Math.min(s, 9);
            sb.append(Integer.toString(digit));
            s -= digit;            
        }
        if(s>0) return -1;
        else return Integer.parseInt(sb.toString());
    }
}
