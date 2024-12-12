import java.util.*;
import java.io.*;

class Main_B1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] week = new String[] {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        int mon = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        
        int sum = 0;
        for(int i=0; i<mon-1; i++){
            sum += month[i];
        }
        sum += day;
        System.out.println(week[sum%7]);
        br.close();
    }
}
