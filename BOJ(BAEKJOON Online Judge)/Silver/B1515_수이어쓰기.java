import java.util.*;
class Main_B1515 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = 0;
        int now = 1;
        for(index =0; index<str.length(); ){
            String nowstr = String.valueOf(now);
            for(int i=0; i<nowstr.length(); i++){
                if(index >= str.length()) break;
                if(nowstr.charAt(i) == str.charAt(index)) index += 1;
            }
            now += 1;
        }
        System.out.println(now-1);
    }
}
