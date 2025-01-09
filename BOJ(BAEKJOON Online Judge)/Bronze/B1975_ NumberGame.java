import java.util.*;
import java.io.*;

class Main_B1975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++){
            int num = Integer.parseInt(br.readLine());
            sb.append(check(num)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    public static int check(int num){
        int count = 0;
        for(int i=2; i<=num; i++){
            int val = num;
            while(true){
                if(val%i!=0) break;
                count += 1;
                val/=i;
            }
        }
        return count;
    }
}
