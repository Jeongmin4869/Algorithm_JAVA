import java.util.*;
import java.io.*;

class Main_B2075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        
        if(N==0){
            System.out.println("NO");
            return;
        }
        
        long[] f = new long[21];
        f[0] = 1;
        for(int i=1; i<=20; i++){
            f[i] = f[i-1] * i;
        }

        for(int i=20; i>=0; i--){
            if(N >= f[i]) N -= f[i];
        }

        if(N==0) System.out.println("YES");
        else     System.out.println("NO");
    }
}
