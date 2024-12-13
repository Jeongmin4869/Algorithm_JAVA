import java.util.*;
import java.io.*;

class Main_B1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] numStr = str.split("-");

        int sum = 0;
        for(int i=0; i<numStr.length; i++){
            String[] nums = numStr[i].split("\\+");
            for(int j=0; j<nums.length; j++){
                if(i == 0) sum += Integer.parseInt(nums[j]);
                else sum -= Integer.parseInt(nums[j]);
            }
        }
        System.out.println(sum);
    }
}
