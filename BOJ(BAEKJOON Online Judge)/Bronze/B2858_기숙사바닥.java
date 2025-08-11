import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int w = 0, l = 0;
        for(int i=3; i<r+b; i++){
            if((r+b)%i == 0){            
                int j = (r+b)/i;
                if((i-2) * (j-2) == b){
                    l = Math.max(i, j);
                    w = Math.min(i, j);
                    break;
                }
            }
        }
        System.out.print(l + " " + w);
    }
}
