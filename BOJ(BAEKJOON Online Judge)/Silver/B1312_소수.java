import java.util.*;
import java.io.*;

class Main_B1312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());
        for(long i=0; i<N; i++){
            A%=B;
            A*=10;
        }
        System.out.println(A/B%10);
        br.close();
    }
}
