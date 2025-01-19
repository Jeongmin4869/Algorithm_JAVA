import java.util.*;
import java.io.*;

class Main_B1251 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<String> list = new ArrayList<>();
        for(int i=1; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++){
                // 0-i / i-j / j ~
                String a =  new StringBuilder(str.substring(0, i)).reverse().toString();
                String b =  new StringBuilder(str.substring(i, j)).reverse().toString();
                String c =  new StringBuilder(str.substring(j)).reverse().toString();
                String s = a + b + c;
                list.add(s);                    
            }
        }
        
        Collections.sort(list);
        System.out.println(list.get(0));
        
    }
}
