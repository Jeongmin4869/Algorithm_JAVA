import java.util.Scanner;

public class Main_B2745 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next()).reverse();
        int N = sc.nextInt();
        long answer = 0;
        for(int i=0; i<sb.length(); i++){
            if(Character.isAlphabetic(sb.charAt(i))){
                answer += Math.pow(N, i) * (sb.charAt(i)-'A'+10);
            }
            else {
                answer += Math.pow(N, i) * (sb.charAt(i)-'0');
            }
        }

        System.out.println(answer);

        sc.close();
    }
}
