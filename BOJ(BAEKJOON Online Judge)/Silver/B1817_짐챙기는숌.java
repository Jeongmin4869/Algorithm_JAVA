import java.util.*;
import java.io.*;

class Main_B1817 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        if(N == 0){
            System.out.println("0");
            return;
        }
        
        int sum = 0;
        int result = 1;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            if((sum+num)>M){
                sum = num;
                result += 1;
            }
            else {
                sum += num;
            }
        }

        System.out.println(result);
        
   }
}
