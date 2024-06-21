import java.util.*;

// 이항계수
public class Main_B1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<count; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            sb.append(check(N, M)).append("\n");
        }
        System.out.println(sb);

        sc.close();
        
    }
    
    public static long check(int N, int M){

        long count = 1;
        int k = (M-N);
        for(int i=0; i<k; i++){
            count *= (M-i);
            count /= (i+1); // k-i 안됨!
        } 
        return count;
    }
}
