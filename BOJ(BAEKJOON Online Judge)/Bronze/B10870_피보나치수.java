import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(fibo(N));

        sc.close();
    }

    public static int fibo(int N){
        if(N==0) return 0;
        else if(N==1) return 1;
        return fibo(N-1)+fibo(N-2);
    }
}
