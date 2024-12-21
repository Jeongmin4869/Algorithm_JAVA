import java.util.*;
import java.io.*;

class Main_B1758 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] tips = new Integer[N];
        for(int i=0; i<N; i++){
            tips[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tips, Collections.reverseOrder());

        long result = 0;
        for(int i=0; i<N; i++){
            int now = tips[i] - i;
            if(now<0) break;
            result += now;
        }

        System.out.println(result);
    }
}
