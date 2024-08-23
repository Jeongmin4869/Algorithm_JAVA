import java.util.*;

class Main_B1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        int answer = Integer.MAX_VALUE;
        for(int i=0; i<3; i++){

            for(int j=i+1; j<4; j++){
                for(int k=j+1; k<5; k++){
                   int now = lcm(arr[k], lcm(arr[j], arr[i]));
                    if(now < answer) answer = now;
                }
            }
        }
        System.out.println(answer);
    }

    public static int gcd(int a, int b){
        if(a%b == 0) return b;
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a, b);
    }
    
}
