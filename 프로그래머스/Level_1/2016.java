class Solution {
    public String solution(int a, int b) {
        Integer[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] weeks = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        Integer day = 0;
        for(int i=0; i<a-1; i++){
            day += days[i];
        }
        day += b;
        return weeks[day%7];
    }
}
