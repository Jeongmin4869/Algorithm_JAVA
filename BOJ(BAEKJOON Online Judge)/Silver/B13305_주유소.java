import java.util.*;
import java.io.*;

class Main_B13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] distance= new long[N-1];
        long[] price = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<N-1; i++){
            distance[i]=Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N; i++){
            price[i]=Long.parseLong(st.nextToken());
        }
        
        long sum = 0;
        for(int i=0; i<N-1; i++){
            long mprice = price[i];
            for(int j=0; j<=i; j++){
                if(price[j]<mprice) mprice = price[j];
            }
            sum += distance[i]*mprice;
        }
        
        System.out.print(sum);
        br.close();

    }
}
