class Solution {
    
    public int sosu(int n){
        int count = 0;
        boolean flag;
        
        for(int i=2; i<=n; i++){
            flag = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count ++;
            }
        }    
        return count;
    }
    
    public int solution(int n) {
        int answer = sosu(n);
        return answer;
    }
}
