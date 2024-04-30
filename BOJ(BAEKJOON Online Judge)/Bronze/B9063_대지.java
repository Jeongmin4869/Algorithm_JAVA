import java.util.*;

public class Main_B9063 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int minx= 10000, miny = 10000, maxx=-10000, maxy=-10000;
        for(int i=0; i<N; i++){
            int xx = sc.nextInt();
            int yy = sc.nextInt();
            minx = Math.min(minx, xx);
            miny = Math.min(miny, yy);
            maxx = Math.max(maxx, xx);
            maxy = Math.max(maxy, yy);
        }
        int w = Math.abs(minx - maxx);
        int h = Math.abs(miny - maxy);
        System.out.println(w*h);
        sc.close();
    }
}
