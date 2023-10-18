class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int firstx,firsty;
        int secondx,secondy;
        int thridx,thridy;
        int fourthx,fourthy;
        
        for(int i=1; i<4; i++){
            firstx  = dots[i][0];       firsty = dots[i][1];
            secondx = dots[(i+1)%4][0]; secondy = dots[(i+1)%4][1];
            thridx  = dots[(i+2)%4][0]; thridy  = dots[(i+2)%4][1];
            fourthx = dots[(i+3)%4][0]; fourthy = dots[(i+3)%4][1];
            
            if(firsty == secondy || firstx == secondx || thridy == fourthy || thridx == fourthx) continue;
            
            if((firsty-secondy)/(double)(firstx-secondx) == (thridy-fourthy)/(double)(thridx-fourthx))
                return 1;
        
        }

        return answer;
    }
}
