import java.util.*;
import java.io.*;

class Main_B1308 {
    static int N, M;
    static int[] check = new int[100001];
    static ArrayList<ArrayList<Integer>> g;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nowYear = Integer.parseInt(st.nextToken());
        int nowMonth = Integer.parseInt(st.nextToken());
        int nowDay = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int endYear = Integer.parseInt(st.nextToken());
        int endMonth = Integer.parseInt(st.nextToken());
        int endDay = Integer.parseInt(st.nextToken());
        
        if(endYear - nowYear > 1000 
            || (endYear-nowYear == 1000 && endMonth > nowMonth )
            || (endYear-nowYear == 1000 && endMonth == nowMonth  && endDay >= nowDay)){  // 윤년이 무조건 포함되어서 endDay >= nowDay로 계산
            System.out.print("gg");
        }
        else {
            int nowDays = countDays(nowYear, nowMonth, nowDay);
            int endDays = countDays(endYear, endMonth, endDay);
            System.out.print("D-" + (endDays - nowDays));
        }
        br.close();
    }

    // 년도, 월, 일을 인자로 받아 일수를 계산하는 함수
    public static int countDays(int year, int month, int day){
        int days = 0;
        days += day;
        for(int i=1; i<month; i++){
            days += checkMonth(year, i);
        }
        for(int i=1; i<year; i++){
            if(checkYear(i)) days += 366;
            else days += 365;
        }
        return days;
    }
    
    // 달의 일수를 반환하는 함수 
    public static int checkMonth(int year, int month){
        int[] day = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(month == 2 && checkYear(year)){
            return 29;
        }
        return day[month];
    }

    // 윤년을 확인하는 함수 
    public static boolean checkYear(int year){
        if(year%4==0){
            if(year%400==0) return true;
            if(year%100==0) return false;
            return true;
        }
        return false;
    }
}
