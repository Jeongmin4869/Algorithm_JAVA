import java.util.*;
import java.io.*;

class Main_B2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[6];
        int maxh = 0, maxw = 0;
        int hidx = 0, widx = 0;
        for(int i=0; i<6; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());
            arr[i] = len;
            if((d==1 || d==2) && len > maxh){
                maxh = len;
                hidx = i;
            }
            if((d==3 || d==4) && len > maxw){
                maxw = len;
                widx = i;
            }
            
        }

        int minw = Math.abs(arr[(hidx+1+6)%6] - arr[(hidx-1+6)%6]);
        int minh = Math.abs(arr[(widx+1+6)%6] - arr[(widx-1+6)%6]);
        
        System.out.println(((maxh*maxw)-(minh*minw))*n);
    }
}
