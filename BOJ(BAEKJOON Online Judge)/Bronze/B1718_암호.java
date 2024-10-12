import java.util.*;

class Main_B1718 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String key = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i) - 'a';
            int move = key.charAt(i%key.length()) - 'a' + 1;

            if(str.charAt(i) == ' '){
                sb.append(" ");
            }else {
                sb.append((char)((now+26-move)%26+'a'));
            }
            
        }

        System.out.println(sb);
        sc.close();
    }

}
