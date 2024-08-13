import java.util.*;

class Main_B1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();

        N = N/100*100;
        int answer = 0;
        while(N%M != 0){
            N++;
            answer ++;
        }
        
        if(answer<10) System.out.print(0);
        
        System.out.println(answer);
    }
}
