import java.util.*;
import java.io.*;

class Main_B27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long answer = factorial(N);
        System.out.println(answer);
        sc.close();
    }
    public static long factorial(int N){
        if(N <= 1) return 1;
        return N * factorial(N-1);
    }
}
