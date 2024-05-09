import java.util.*;

public class Main_B19532 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int x =  (c*e - b*f) / (a*e - d*b);
        int y =  (c*d - a*f) / (d*b - a*e);
        System.out.println(x + " " + y);
        /*
        int x=0, y=0;
        boolean flag = false;
        for(x = -999; x<=999; x++){
            for(y = -999; y<=999; y++){
                if((a*x + b*y) == c  && (d*x + e*y) == f){
                    System.out.println(x + " " + y);
                    sc.close();
                    return;
                }
            }   
        }
        */
        
        sc.close();
   
    }
}
