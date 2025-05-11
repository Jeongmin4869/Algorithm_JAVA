import java.util.*;
import java.io.*;

class Main_B2697 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String num = br.readLine();
            String bignum = check(num);
            if(bignum.equals(num)) System.out.println("BIGGEST");
            else System.out.println(bignum);
        }        
    }

    public static String check(String num){
        char[] nums = num.toCharArray();
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                char std = nums[i];
                Arrays.sort(nums, i+1, nums.length);
                for(int j=i+1; j<nums.length; j++){
                    if(std < nums[j]){                        
                        nums[i] = nums[j];
                        nums[j] = std;      
                        break;
                    }
                }
                break;
            }
        }
        num = String.valueOf(nums);
        return num;
    }

}
