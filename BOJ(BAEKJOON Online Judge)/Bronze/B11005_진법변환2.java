import java.util.Scanner;

public class Main_B11005 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int N = sc.nextInt();
        String str = "";

        while(num > 0){
            int a = num%N;
            if(a<10){
                str = String.valueOf(a) + str;
            }
            else {
                str = (char)('A'-10+a) + str;
            }
            num /= N;
        }

        System.out.println(str);
        sc.close();
    }
}
