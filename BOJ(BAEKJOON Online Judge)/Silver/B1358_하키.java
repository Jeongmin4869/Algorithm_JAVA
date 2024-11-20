import java.util.*;
import java.io.*;

class Main_B1358 {
    static int w, h, x, y;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         w = Integer.parseInt(st.nextToken());
         h = Integer.parseInt(st.nextToken());
         x = Integer.parseInt(st.nextToken());
         y = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int count =0;
        for(int i=0; i<p; i++){
            st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());
            if(check(px, py)) count += 1;
        }
        
        System.out.println(count);
    }

    static boolean check(int px, int py){
        if(px>=x && px <= (x+w) && py >= y && py <= (y+h)){
            return true;
        }
      
        int cx;
        int cy = y+h/2;
        if(px<=x){
            cx = x;
        }
        else{
            cx = x+w;
        }
        
        if((px-cx)*(px-cx)+(py-cy)*(py-cy) <= (h/2)*(h/2)){
            return true;
        }

        return false;
    }
}
