import java.util.*;
import java.io.*;

class Main_B1942 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = 1;
        while(n<=3){
            n += 1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String e = st.nextToken();
            int sseconds = toSeconds(s);
            int eseconds = toSeconds(e);
            if(sseconds>eseconds){
                eseconds += 24*3600;
            }
            int count = 0;
            for(int i=sseconds; i<= eseconds; i++){
                if(check(i)) count += 1;
            }
            sb.append(count).append("\n");
        }
        
        System.out.println(sb);
    }

    public static int toSeconds(String str){
        String[] arr = str.split(":");
        int second = 0;
        second = Integer.parseInt(arr[0]) * 3600
                   + Integer.parseInt(arr[1]) * 60
                   + Integer.parseInt(arr[2]) ;

        return second;
    }

    public static boolean check(int time){
        int hour = time/3600;
        int min = time /60%60;
        int seconds = time%60;
        String tstr = String.format("%02d%02d%02d", hour, min, seconds);

        if(Integer.parseInt(tstr)%3!=0) return false;

        return true;
    }
}
