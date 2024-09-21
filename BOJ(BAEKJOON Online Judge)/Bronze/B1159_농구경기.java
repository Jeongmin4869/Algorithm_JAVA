import java.util.*;
import java.io.*;

class Main_B1159 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] alpha = new int[26];
        for(int i=0; i<N; i++){
            String name = br.readLine();
            alpha[name.charAt(0)-'a'] += 1;
        }

        for(int i=0; i<alpha.length; i++){
            if(alpha[i] >= 5) 
                sb.append((char)('a'+i));
        }

        if(sb.length() == 0) System.out.println("PREDAJA");
        else System.out.println(sb);
    }
}
