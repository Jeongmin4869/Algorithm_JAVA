import java.util.*;

public class Main_B4134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        long[] nums = new long[N];
        
        for(int i=0; i<N; i++){
            nums[i] = sc.nextLong();
        }

        for(int i=0; i<nums.length; i++){
            for(long num = nums[i]; ; num++){
                if(isPrime(num)) {
                    sb.append(num).append("\n");
                    break;
                }
            }
        }
        
        System.out.print(sb);
        sc.close();
    }  
    
    public static boolean isPrime(long num){
        if(num <= 1) return false;
        for(long i = 2; i*i<=num; i++){
            if(num%i==0) return false;
        }
        return true;
    }

      /*
    
    public static boolean isPrime(long num) {
        if (num <= 1) return false;  // 1 이하의 숫자는 소수가 아니다.
        if (num <= 3) return true;   // 2와 3은 소수이다.
        if (num % 2 == 0 || num % 3 == 0) return false;  // 2 또는 3으로 나누어 떨어지면 소수가 아니다.
        for (long i = 5; i * i <= num; i += 6) { // 모든 소수는 6k ± 1 형태에 위치
            if (num % i == 0 || num % (i + 2) == 0) return false;  // 5와 7, 11과 13, 17과 19 등을 검사
        }
        return true;  // 위 조건들을 모두 통과하면 소수이다.
    }
    */
}
