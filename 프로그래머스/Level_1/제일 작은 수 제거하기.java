class Solution {
  public int[] solution(int[] arr) {
      if(arr.length == 1){
          int[] answer = {-1};
          return answer;
      }

      int[] answer = new int[arr.length-1];
      int minIdx=0;

      for(int i=1; i<arr.length ;i++){
          if(arr[minIdx]>arr[i]) minIdx = i;
      }
      
      for(int i=0;i<minIdx;i++){
          answer[i] = arr[i];
      }
      
      for(int i=minIdx+1 ;i<arr.length;i++){
          answer[i-1] = arr[i];
      }
      return answer;
  }
}
