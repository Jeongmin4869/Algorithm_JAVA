import java.util.*;
import java.io.*;

class Main_B2028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(sc.nextLine());
            if(check(num)) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }

    public static boolean check(int num){
        int nn = num * num ;
        int size = (int)Math.log10(num)+1;
        if(num == nn%Math.pow(10, size)) return true;
        return false;
    }
}
