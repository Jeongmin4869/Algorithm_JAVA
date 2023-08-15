import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] aftarr = arr.clone();
        int[] prearr = arr.clone();
        while(true){
            answer += 1;
            for(int i=0; i<aftarr.length; i++){
                if(aftarr[i] % 2 == 0 && aftarr[i] >= 50) aftarr[i]/=2;
                else if (aftarr[i] % 2 !=  0 && aftarr[i] < 50) aftarr[i] = aftarr[i] * 2 + 1;
            }
            if(Arrays.equals(aftarr, prearr)){
                break;
            }
            prearr = aftarr.clone();
        }
        return answer-1;
    }
}
