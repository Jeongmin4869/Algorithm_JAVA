import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sum = 0;
        for(int i=0; i<9; i++){
            sum += arr[i];
        }
        int dis = sum-100;
        int a =0, b=0;
        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(arr[i] + arr[j] == dis){
                    a = arr[i];
                    b = arr[j];
                    break;
                }
            }
            if(a>0 && b>0) break;
        }

        for(int i=0; i<9; i++){
            if(arr[i] == a || arr[i] == b) continue;
            System.out.println(arr[i]);
        }
    }
}
