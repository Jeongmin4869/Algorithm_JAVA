import java.util.Scanner;

public class Main_B2566 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0, N = 0, M = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = sc.nextInt();
                if (max < num) {
                    N = i+1;
                    M = j+1;
                    max = num;
                }
            }
        }

        System.out.println(max);
        System.out.println(N + " " + M);

        sc.close();

    }
}
