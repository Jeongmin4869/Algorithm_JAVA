import java.util.*;

class Main_B1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] nums = new int[10];
        for(int i=0; i<str.length(); i++){
            int num = str.charAt(i)-'0';
            if(num == 6 || num == 9){
                if(nums[6]>=nums[9]) nums[9] += 1;
                else nums[6] += 1;
            }
            else{
                nums[num] += 1;
            }
        }

        int result = 0;
        for(int i=0; i<10; i++){
            result = Math.max(result, nums[i]);
        }
        
        System.out.println(result);
    }
}
