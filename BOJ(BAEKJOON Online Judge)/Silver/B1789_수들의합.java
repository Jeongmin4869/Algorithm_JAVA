import java.util.*;
import java.io.*;

class Main_B1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long count = 1;
        while(true){
            N -= count;
            if(N<0) break;
            count += 1;
        }
        System.out.println(count-1);
    }
}
