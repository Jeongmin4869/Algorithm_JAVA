import java.util.*;
import java.io.*;

class Main_B1173 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int X = m;
        int result = 0;

        if(X+T>M){
            System.out.println(-1);
            br.close();
            return;
        }
        
        while(N>0){
            result += 1;
            if(X+T <= M){
                N -= 1;
                X += T;
            }
            else {
                X -= R;
                if(X<m) X = m;
            }
        }

        System.out.println(result);
        br.close();
    }
}
