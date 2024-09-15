import java.util.*;

class Main_B1435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] check = new int[101];
        int N = sc.nextInt();
        int count = 0;
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            if(check[num]>0) count ++;
            else check[num] += 1;
        }
        
        System.out.println(count);
        sc.close();
    }
}
