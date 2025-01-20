import java.util.*;

class Main_B2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int s = 1, e = 1;
        int sum = 1;
        while(s<=n){
            if(sum == n){
                count += 1;
                sum -= s;
                s += 1;
            }
            else if(sum<n) {
                e += 1;
                sum += e;
            }
            else{
                sum -= s;
                s += 1;
            }
        }
        System.out.println(count);
    }
}
