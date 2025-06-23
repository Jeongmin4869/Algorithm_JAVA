import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int move = 0;
        for(int i=0; i<4; i++){
            String str = br.readLine();            
            for(int j=0; j<4; j++){
                char c = str.charAt(j);
                if(c == '.') continue;
                int index = c - 'A';
                int x = index%4;
                int y = index/4;
                move += Math.abs(i - y) + Math.abs(j - x);
            }            
        }
        System.out.println(move);
    }
}
