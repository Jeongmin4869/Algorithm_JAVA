import java.util.*;
import java.io.*;

class Main_B1418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        for(int i = 1; i<= N; i++){
            int num = i;
            if(num <= k){
               count += 1;
                continue;
            }

            int j =0;
            for(j=2;j<=Math.sqrt(num);){
                if(num%j==0){
                    num /= j;
                } 
                else{
                    j+=1;
                }
            }

            if(j<=k && num<=k) count += 1;            
        }    
        System.out.println(count);
    }
}
