class Solution {
    public int[] diStringMatch(String s) {
        int N = s.length();
        int[] arr = new int[N+1];

        int low = 0;
        int high = N;
        for(int i=0; i<N; i++){
            if(s.charAt(i) == 'I'){
                arr[i] = low++;                
            }
            else {
                arr[i] = high--;
            }
        }
        arr[N] = high;
        return arr;
    }

}
