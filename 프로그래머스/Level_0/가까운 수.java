import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[][] arr = new int[array.length][2];
        
        for(int i=0; i<array.length; i++){
            arr[i][0] = array[i];
            arr[i][1] = Math.abs(array[i]-n);
        }
        
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1]) return  o1[0] - o2[0];
            return o1[1] - o2[1];
        });
           
        return answer = arr[0][0];
    }
}
