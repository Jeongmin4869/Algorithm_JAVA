import java.util.*;

class Main_B1816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();
            sb.append(check(num) ? "YES" : "NO").append("\n");
        }
        System.out.println(sb);
    }

    public static boolean check(long num) {
        if (num <= 1) return false; 
        if (num == 2 || num == 3) return true; 
        if (num % 2 == 0 || num % 3 == 0) return false; 

        // 6k ± 1 형태의 수로 확인
        for (long i = 6; i <= 1000000; i += 6) {
            if (num % (i-1) == 0 || num % (i + 1) == 0) {
                return false; 
            }
        }
        return true; 
    }
}
