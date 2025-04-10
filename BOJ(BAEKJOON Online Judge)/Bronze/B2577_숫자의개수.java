import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        long c = Long.parseLong(br.readLine());
        String[] arr = String.valueOf(a * b * c).split("");
        int[] nums = new int[10];
        for(int i=0; i<arr.length; i++){
            nums[Integer.parseInt(arr[i])] += 1;
        }

        for(int i=0; i<10; i++){
            System.out.println(nums[i]);
        }
        
    }
}
