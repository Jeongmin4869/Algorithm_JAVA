import java.util.*;
import java.io.*;

class Main_B2622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=1; i<N; i++){
            for(int j=i; j<N; j++){
                int k = N-(i+j);
                if(j>k) break;
                if(k<(i+j)) count += 1;
            }
        }
        System.out.println(count);
    }
}
