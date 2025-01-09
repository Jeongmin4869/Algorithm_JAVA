import java.util.*;
import java.io.*;

class Main_B1977 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int sum = 0;
        int num = (int)Math.ceil(Math.sqrt(s));
        int min = num*num;
        while(true){
            int now = num*num;
            if(now>e) break;
            sum += now;      
            num += 1;
        }

        if(sum == 0) System.out.print(-1);
        else System.out.print(sum + "\n" + min);
        
    }
}
