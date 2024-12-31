import java.util.*;
import java.io.*;

class Main_B1964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dots = 5;
        int count = 2;
        while(count <= n){
            dots += (count*3 + 1);
            dots %= 45678;
            count += 1;
        }
        
        System.out.println(dots);
    }
}
