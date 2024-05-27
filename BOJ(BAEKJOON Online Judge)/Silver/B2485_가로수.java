import java.util.*;

public class Main_B2485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int N = sc.nextInt();
        int[] arr = new int[N-1];
        int before = sc.nextInt();
        int count = 0;
        for(int i=0; i<N-1; i++){
            int now = sc.nextInt();
            arr[i] = now - before;
            before = now;
        }
        
        int g = arr[0];
        for(int i=1; i<arr.length; i++){
            g = gcd(g, arr[i]);
        }
        
        for(int i=0; i<arr.length; i++){
            count += arr[i]/g -1;
        }
        
        System.out.println(count);
       
        sc.close();
    }
    
    public static int gcd(int a, int b){
        if(a%b==0) return b;
        return gcd(b, a%b);
    }
    
}
