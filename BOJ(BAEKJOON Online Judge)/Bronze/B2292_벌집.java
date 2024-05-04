import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main_B2292 {
    public static void main(String[] args) throws IOException {
        /*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 1;
        int answer = 0;
        while(N>0){
            N -= num;
            answer += 1;
            num = answer * 6;
        }        

        System.out.println(answer);
    }
}
