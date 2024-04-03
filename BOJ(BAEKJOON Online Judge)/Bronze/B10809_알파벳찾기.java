import java.util.Scanner;

public class Main_B10809 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] alpha = new String[26];
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            alpha[i] = String.valueOf(c);
            c++;
        }

        for (String al : alpha) {
            System.out.print(str.indexOf(al) + " ");
        }
    }
}
