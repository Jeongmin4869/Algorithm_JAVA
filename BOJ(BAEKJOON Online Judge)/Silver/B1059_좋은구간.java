import java.util.*;
import java.io.*;

class Main_B1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] S = new int[L];
        for (int i=0; i<L; i++ ) {
            S[i] = Integer.parseInt(st.nextToken());
            if(S[i] == n) {
                System.out.println(0);
                return;
            }
        }

        Arrays.sort(S);

        int s=1, e=10000, count = 0;
        for (int i=0; i<L; i++ ) {
            if(S[i]>n){
                e = S[i]-1;
                if(i > 0){
                    s = S[i-1]+1;
                }
                break;
            }
        }

        count = (n-s)*(e-n+1) + (e-n);
        System.out.println(count);
        br.close();
    }
}
