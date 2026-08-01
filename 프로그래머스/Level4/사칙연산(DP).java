import java.util.*;

class Solution {
    public int solution(String arr[]) {
        int answer = -1;
        List<Integer> num = new ArrayList<>();
        List<String> ops = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(i==0 || i%2==0){
                num.add(Integer.parseInt(arr[i]));
            }
            else {
                ops.add(arr[i]);
            }
        }
        
        int n = num.size();
        int[][] maxArr = new int[n][n];
        int[][] minArr = new int[n][n];
        for(int i=0; i<n; i++){
            maxArr[i][i] = num.get(i);
            minArr[i][i] = num.get(i);
        }
        
        for(int len = 2; len<=n; len++){
            for(int s=0; s<=n-len; s++){
                int e = s+len-1;
                maxArr[s][e] = Integer.MIN_VALUE;
                minArr[s][e] = Integer.MAX_VALUE;

                for(int k=s; k<e; k++){ // k는 분할점
                    String op = ops.get(k);
                    if(op.equals("+")){
                        maxArr[s][e] = Math.max(maxArr[s][k]+maxArr[k+1][e], maxArr[s][e]);
                        minArr[s][e] = Math.min(minArr[s][k]+minArr[k+1][e], minArr[s][e]);
                    }else {
                        maxArr[s][e] = Math.max(maxArr[s][k]-minArr[k+1][e], maxArr[s][e]);
                        minArr[s][e] = Math.min(minArr[s][k]-maxArr[k+1][e], minArr[s][e]);
                    }
                    
                }
            }
        }
        
        answer = maxArr[0][n-1];
        return answer;
    }
}
