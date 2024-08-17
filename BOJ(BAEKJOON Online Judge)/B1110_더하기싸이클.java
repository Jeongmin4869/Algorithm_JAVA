import java.util.*;

class Main_B1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int now = N;
        int count = 0;
        while(true){
            count ++ ;
            now = (now%10*10) + (now%10+now/10)%10;
            if(now == N) break;
        }
        System.out.print(count);
        sc.close();
    }    
}
