import java.util.*;
import java.io.*;

class Main_B2355 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
 
        long max = Math.max(a,b);
        long min = Math.min(a,b);
        long result = (((max+1)*max)/2) - (((min-1)*min)/2);
        
        System.out.println(result);
    }
}
