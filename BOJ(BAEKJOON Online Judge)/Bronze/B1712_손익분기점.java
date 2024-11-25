import java.util.*;
import java.io.*;

class Main_B1712 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(b>=c){
            System.out.println(-1); 
            return;
        }

        int d = c-b;
        int result = a/d+1;
        
        System.out.println(result);
    }
}
