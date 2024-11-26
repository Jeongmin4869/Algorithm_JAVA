import java.util.*;

class Main_B1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum = 0;
        for(long i=num-1; i>0; i--){
            sum += i*num+i;
        }
        
        System.out.print(sum);
    }
}
