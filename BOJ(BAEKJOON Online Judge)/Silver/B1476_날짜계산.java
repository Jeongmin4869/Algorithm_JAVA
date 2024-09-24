import java.util.*;

class Main_B1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        int year = 0;
        int ee = 0;
        int ss = 0;
        int mm = 0;
        while(true){
            year += 1;
            ee += 1;
            ss += 1;
            mm += 1;
            if(ee>15) ee=1;
            if(ss>28) ss=1;
            if(mm>19) mm=1;
            if(ee==E && ss==S && mm==M) break;
        }
        
        
        System.out.println(year);
        sc.close();
    }
}
