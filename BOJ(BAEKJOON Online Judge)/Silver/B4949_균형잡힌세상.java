import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_B4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while (true) {
            str = br.readLine();
            if (str.equals(".")) break;
            sb.append(check(str) ? "yes" : "no").append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    
    public static boolean check(String str) {
        char[] arr = str.toCharArray();
        Stack<Character> s = new Stack<>();
        
        for (char c : arr) {
            if (c == '(' || c == '[') {
                s.push(c);
            }
            
            else if (c == ')') {
                if (s.isEmpty()||s.peek() != '(') return false;
                else s.pop();
            } else if (c == ']') {
                if (s.isEmpty()||s.peek() != '[' ) return false;
                else s.pop();
            }
            
        }
        
        return s.isEmpty();
    }
}
