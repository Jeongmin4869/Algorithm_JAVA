import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[10001];
        for(int i=1; i<=10000; i++){
            int num = i;
            int now = i;
            while(now > 0){
                num += now%10;
                now /= 10;
            }
            if(num <= 10000)
                arr[num] = true;
        }

        for(int i=1; i<=10000; i++){
            if(!arr[i])
                System.out.println(i);
        }
    }
}
