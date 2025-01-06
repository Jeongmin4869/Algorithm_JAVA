import java.util.*;
import java.io.*;

class Main_B1124 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[101];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i=2; i<=100; i++){
            if(isPrime[i] == true){
                for(int j=2; i*j<=100; j++){
                    isPrime[i*j] = false;
                }
            }
        }
        
        int result = 0;
        for(int i=A; i<=B; i++){
            int now = i;
            int count = 0;
            int n = 2;
            while(now>1){
                if(now%n==0){
                    now/=n;
                    count += 1;
                }
                else{
                    n+=1;
                }
            }

            if(isPrime[count]) result += 1;
        }
     
        System.out.println(result);
    }
}
