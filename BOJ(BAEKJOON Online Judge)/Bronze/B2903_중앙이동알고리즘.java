import java.util.Scanner;

public class Main_B2903 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 2;
        
        for(int i=1; i<=N; i++){
            answer = answer + (answer-1);
        }
        
        System.out.println((int)Math.pow(answer, 2));

        sc.close();
    }
}
