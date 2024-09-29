import java.util.*;

class Main_B1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        if(N<100){
            count = N;
        }
        else {
            count = 99;
            for(int i=100; i<=N; i++){
                int a = i%10; // 1의자리리
                int b = (i/10)%10; // 10의자리리
                int c = i/100; // 100의자리
                if(a-b == b-c){
                    count += 1;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
