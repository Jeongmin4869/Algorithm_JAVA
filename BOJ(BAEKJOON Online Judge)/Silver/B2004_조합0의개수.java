import java.util.*;
import java.io.*;

class Main_B2004 {
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        // 5의승수와 2의승수중 작은 값
        long count5 = countFive(n) - (countFive(m) + countFive(n-m));
        long count2 = countTwo(n) - (countTwo(m) + countTwo(n-m));
        
        System.out.print(Math.min(count5, count2));
        
    }

    public static long countFive(long num){
        long count = 0;
        for(long i=5; i<=num; i*=5){
            count += num/i;
        }        
        return count;
    }
    public static long countTwo(long num){
        long count = 0;
        for(long i=2; i<=num; i*=2){
            count += num/i;
        }        
        return count;
    }
}
