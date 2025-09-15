import java.util.*;
import java.io.*;

class Main {
    static long c ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());
        
        System.out.print(pow(a, b));
    }

    // 분할정복 거듭제곱 
    public static  long pow(long a, long b){
        if(b == 1) return a%c;
        
        long now = pow(a, b/2);

        // 지수가 홀수
        if(b%2==1){
            return (now * now)%c * a % c;
        }
        // 지수가 짝수 
        return (now * now)%c;
    }

}
