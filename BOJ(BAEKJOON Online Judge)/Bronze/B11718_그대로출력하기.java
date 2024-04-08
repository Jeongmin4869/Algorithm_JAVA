import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_B11718 {

    public static void main(String[] args){
        /*
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
        */
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}
