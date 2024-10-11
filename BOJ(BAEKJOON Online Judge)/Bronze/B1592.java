import java.util.*;

class Main_B1592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int L = sc.nextInt(); 
        int[] arr = new int[N];
        int now = 0; 
        arr[now] = 1; 
        int count = 0;
        
        while (true) {
            if(arr[now]==M)break;
            if (arr[now] % 2 == 0) { 
                now = (now + L) % N;
            } else { 
                now = (now - L + N) % N;
            }
            arr[now] += 1; 
            count += 1; 
        }
        
        System.out.println(count);
    }
}
