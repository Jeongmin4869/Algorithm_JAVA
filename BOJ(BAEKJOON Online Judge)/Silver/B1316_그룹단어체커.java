import java.util.Scanner;

public class Main_B1316 {
    
    static boolean check(String str) {

        char prev = 0, now;
        boolean[] al = new boolean[26];
        String chars = "" ;

        for (int i = 0; i < str.length(); i++) {
            now = str.charAt(i);
            if (prev != now) {
                if (al[now-'a']) {
                  return false;
                }
                al[now - 'a'] = true;
                prev = now;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int answer = 0;
        for(int i=0; i<count; i++){
            String str = sc.next();
            answer += check(str) ? 1 : 0;
        }

        System.out.print(answer);
    }
}
