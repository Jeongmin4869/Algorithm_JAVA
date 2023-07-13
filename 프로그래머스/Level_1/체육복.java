class Solution {
    // 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
    // 전체 학생의 수 n
    // 체육복을 도난당한 학생들의 번호가 담긴 배열 lost
    // 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve
    
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int stu[] = new int[n];
        
        for(int i : lost){
            stu[i-1] -= 1;
        }
        
       for(int i : reserve){
            stu[i-1] += 1;
        }
        
        for(int i=0; i<n; i++){
            if(stu[i] == -1){
                if( i-1 >= 0 && stu[i-1] == 1){
                    stu[i-1] -= 1;
                    stu[i] += 1;
                }
                else if( i+1 < n && stu[i+1] == 1){
                    stu[i+1] -= 1;
                    stu[i] += 1;
                }
                else answer -= 1;
            }
          
        }
        
        return answer;
    }
}
