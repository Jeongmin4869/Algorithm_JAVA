import java.util.*;

class Main_B1357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B = sc.nextInt();
        int result = Rev(Rev(A) + Rev(B));

            
        System.out.println(result);
    }

    public static int Rev(int num){
        int n =0;
        while(num>0){
            n+=num%10;
            num/=10;
            if(num<=0) break;
            n*=10;
        }
        return n;
    }
}
