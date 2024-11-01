import java.util.*;
import java.io.*;

class Main_B1639 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        int max = 0;
        for(int i=0; i<str.length-1; i++){
            for(int j=1; j<=(str.length-i)/2; j++){
                int sum1 = 0;
                int sum2 = 0;
                for(int k=0; k<j; k++){
                    sum1+=Integer.parseInt(str[i+k]);
                    sum2+=Integer.parseInt(str[i+j+k]);
                }
                if(sum1==sum2) max = Math.max(j*2, max);
            }
        }
        System.out.println(max);
    }
}
