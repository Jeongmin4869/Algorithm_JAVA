import java.util.Arrays; // sort

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] w = new int[sizes.length];
        int[] h = new int[sizes.length];
        for(int i=0; i<sizes.length; i++){
            h[i] = Math.min(sizes[i][0],sizes[i][1]);
            w[i] = Math.max(sizes[i][0],sizes[i][1]);
        }
        Arrays.sort(h);
        Arrays.sort(w);
        answer = h[sizes.length-1] * w[sizes.length-1] ;
        
        return answer;
    }
}
 
