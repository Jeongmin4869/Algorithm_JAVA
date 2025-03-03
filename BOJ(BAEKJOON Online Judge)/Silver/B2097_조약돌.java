import java.util.*;
import java.io.*;

class Main_B2097 {
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int N = Integer.parseInt(br.readLine());

        if(N == 1 || N == 2){
            System.out.print(4);
        }
        else {
            int r = (int)Math.round(Math.sqrt(N)); // ROUND 조건 필요
            System.out.println(r);
            if(r*r >= N){
                System.out.print((r-1) * 4);
            }
            else {
                System.out.print(((r-1) * 2) + (r * 2));
            }
        }
        
    }
}
