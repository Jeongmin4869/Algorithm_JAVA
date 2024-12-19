import java.util.*;

class Main_B1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int len = 0;
        int s = 1;
        int count = 1;
        while(s<=N){
            int e = Math.min(s*10-1, N);
            len += (e-s+1)*count;
            count += 1;
            s *= 10;
        }
        
        System.out.println(len);
    }
}
