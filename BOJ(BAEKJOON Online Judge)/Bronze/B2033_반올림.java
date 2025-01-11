import java.util.*;

class Main_B2033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int now = 10;
        while(n>now){
            
            if(n%now >= now/2){
                n += now;                
            }

            n -= n%now;
            now *= 10;
        }

        System.out.print(n);
        sc.close();

    }
}
