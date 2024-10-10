import java.util.*;

class Main_B1681{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String L = sc.next();
        long now = 0;
        for(long i=1; i<=N; i++){
            now +=1;
            while(Long.toString(now).contains(L)){
                    now += 1;
            }
        }
               
        System.out.println(now);
     }
}
