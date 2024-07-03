import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B25501 {
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            count = 0;
            String str = br.readLine();
            int num = isPalindromem(str);
            sb.append(num + " "+ count).append("\n");
        }
        
        System.out.println(sb);
    }


    public static int recursion(String s, int l, int r){
        count += 1;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindromem(String s){
        return recursion(s, 0, s.length()-1);
    }
    
}
