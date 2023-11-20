import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        /*
        1. 
        int d1 = 0, d2 = 0;
        for(int i=0; i<date1.length; i++){
            d1 = (d1 + date1[i]) * 10;
            d2 = (d2 + date2[i]) * 10;
            if(d1 < d2) return 1;
        }
        */
        
        /*
        2. 
        for(int i=0; i<3; i++){
            if(date1[i] < date2[i]) return 1;
            else if (date1[i] > date2[i]) return 0;
        }
        */
        
        LocalDate d1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate d2 = LocalDate.of(date2[0], date2[1], date2[2]);
        
        return d1.isBefore(d2) ? 1 : 0;
    }
}
