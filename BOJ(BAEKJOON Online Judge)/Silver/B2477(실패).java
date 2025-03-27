import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int h=0, w=0;
        int[] arrh = new int[6];
        int[] arrw = new int[6];
        for(int i=0; i<6; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());
            if(d==1){
                w += len;
                arrw[i] = Math.abs(w);
            }
            else if(d==2){
                w -= len;
                arrw[i] = Math.abs(w);
            }
            else if(d==3){
                h += len;
                arrh[i] = Math.abs(h);
            }
            else if(d==4){
                h -= len;
                arrh[i] = Math.abs(h);
            }
        }

        Arrays.sort(arrw);
        Arrays.sort(arrh);
        int maxh = arrh[5];
        int maxw = arrw[5];
        int minh = maxh - arrh[4];
        int minw = maxw - arrw[4];
        System.out.println(((maxh*maxw)-(minh*minw))*n);
    }
}
