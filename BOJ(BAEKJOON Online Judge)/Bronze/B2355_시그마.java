import java.util.*;
import java.io.*;

class Main_B2355 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long result = (b+1)*(b/2) - (a-1)*(a/2);
        if(b%2!=0) result += 1;
        if(a%2!=0) result -= 1;
        
        System.out.println(result);
    }
}
