import java.util.*;

class Main_B1408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] now = sc.nextLine().split(":");
        String[] start = sc.nextLine().split(":");

        int nowsec = Integer.parseInt(now[0])*60*60 
                      + Integer.parseInt(now[1])*60 
                      + Integer.parseInt(now[2]);

        int startsec = Integer.parseInt(start[0])*60*60 
                      + Integer.parseInt(start[1])*60 
                      + Integer.parseInt(start[2]);

        int time = startsec-nowsec;
        if(time<0) time += 24*60*60;
        System.out.format("%02d:%02d:%02d", time/3600, time/60%60, time%60);
        sc.close();
    }
}
