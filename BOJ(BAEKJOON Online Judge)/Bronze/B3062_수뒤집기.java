import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            int sum = num + reverseNum(num);            
            if(check(sum)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static int reverseNum(int num){
        int result = 0;
        while(num > 0){
            result = result*10 + num%10;
            num /= 10;
        }
        return result;
    }

    public static boolean check(int num){
        String str = String.valueOf(num);
        String revStr = new StringBuilder(str).reverse().toString();        
        return str.equals(revStr);
    }
}
