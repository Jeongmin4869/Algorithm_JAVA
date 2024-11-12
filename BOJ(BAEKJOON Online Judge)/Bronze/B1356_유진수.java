import java.util.*;

class Main_B1356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] nums = sc.nextLine().split("");       

        if(nums.length == 1){
            System.out.println("NO");
            return;
        }
        
        for(int i=1; i<nums.length; i++){
            int a = 1;
            int b = 1;
            for(int j=0; j<i; j++){
                a *= Integer.parseInt(nums[j]);
            }
            for(int k=i; k<nums.length; k++){
                b *= Integer.parseInt(nums[k]);
            }
            if(a==b){
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");
        sc.close();
    }
}
