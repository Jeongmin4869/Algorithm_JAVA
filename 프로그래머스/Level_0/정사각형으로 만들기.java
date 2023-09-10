
class Solution {
    public int[][] solution(int[][] arr) {
        int max = Math.max(arr.length,arr[0].length);
        int[][] answer = new int[max][max];
        /*
        for(int i=0; i<max; i++){
            for(int j=0; j<max; j++){
                if(i >= arr.length){
                    answer[i] = new int[max];
                    continue;
                }
                if(j >= arr[i].length){
                    answer[i][j] = 0;
                }
                else {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        */
        for(int i=0; i<arr.length; i++){
            System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
        }
        
        return answer;
    }
}
