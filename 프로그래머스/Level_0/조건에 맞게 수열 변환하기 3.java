class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[i] = (arr[i] * (k%2) * k) + (arr[i] + k) * ((k%2+1)%2);
        }
        return answer;
    }
}
