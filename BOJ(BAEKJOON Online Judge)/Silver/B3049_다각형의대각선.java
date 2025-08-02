import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // nC4 구하기 

        long result = 1;       
        for(long i=0; i<4; i++){
            result *= (n-i);
            result /= (i+1) ;
        }

        System.out.println(result);
    }
}
