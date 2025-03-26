import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int h=0, w=0;
        int maxh=0, maxw=0;
        int minh=10000, minw=10000;
        for(int i=0; i<6; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());
            if(d==1){
                w += len;
            }
            else if(d==2){
                w -= len;
            }
            else if(d==3){
                h += len;
            }
            else if(d==4){
                h -= len;
            }

            maxh = Math.max(maxh, Math.abs(h));
            maxw = Math.max(maxw, Math.abs(w));

            System.out.println(maxh + " " + maxw);
                
            minh = Math.min(minh, Math.abs(h));
            minw = Math.min(minw, Math.abs(w));

            System.out.println(minh + " " + minw);
            
        }
        
        System.out.println(((maxh*maxw)-(minh*minw))*n);
    }
}
