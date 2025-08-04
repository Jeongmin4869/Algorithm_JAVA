import java.util.*;
import java.io.*;

class Main_B3060 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
                        
            long total = Long.parseLong(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            long[] arr = new long[6];
            long sum = 0;
            long day = 1;
            
            for(int j=0; j<6; j++){                
                sum += Long.parseLong(st.nextToken());                
            }    
            
            while(sum <= total){
                day += 1;
                sum *= 4;                
            }

            System.out.println(day);
            
        }      
    }

}
