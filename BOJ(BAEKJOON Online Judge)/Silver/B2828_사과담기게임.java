import java.util.*;
import java.io.*;

class Main_B2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(br.readLine());
        int l = 1, r = M;
        int count = 0;
        for(int i=0; i<J; i++){
            int now = Integer.parseInt(br.readLine());
            if(now<l){
                count += l-now;
                r -= l-now;
                l = now;
            }
            else if(now>r){
                count += now-r;
                l+= now-r;
                r = now;                

            }
        }
        
        System.out.println(count);
    }
}
