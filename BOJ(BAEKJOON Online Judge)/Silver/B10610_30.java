import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        String[] arr = num.split("");
        boolean flag = false;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
            if(arr[i].equals("0")) flag = true;
        }
        
        if(flag && sum%3==0){
            Arrays.sort(arr, Collections.reverseOrder());
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]);
            }
        }
        else System.out.print(-1);
    }
}
