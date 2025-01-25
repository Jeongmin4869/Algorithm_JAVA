import java.util.*;
import java.io.*;

class Main_B1254 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int len = str.length();
        int plusStrLen = 0;
        for(int i=0; i<len; i++){
            if(check(str.substring(i))){
                plusStrLen = i;
                break;
            }            
        }    
        System.out.println(len + plusStrLen);
    }

    public static boolean check(String s){
        int l = 0, r = s.length() - 1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){ 
                return false;            
            }
            l += 1;
            r -= 1;
        }
        return true;
    }

    
}
