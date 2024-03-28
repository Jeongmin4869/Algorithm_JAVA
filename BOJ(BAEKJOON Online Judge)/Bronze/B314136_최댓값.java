import java.util.Scanner;

public class Main_B314136 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, max = 0, index = 0;
        for(int i=1; i<=9; i++){
            num = sc.nextInt();
            if(num > max){
                index = i;
                max = num;
            }
        }
        System.out.println(max + "\n" + index);
    }
}
