import java.util.*;

class Main_B2145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            sb.append(check(n) + "\n");
        }
        
        System.out.println(sb);
    }

    public static int check(int num){
        while(num>=10){
            int sum = 0;
            while(num>0){
                sum += num%10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
