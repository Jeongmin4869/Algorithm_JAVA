import java.util.*;

public class Main_B17103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] nums = new int[N];
        int max = 0;
        
        for(int i=0 ; i<N; i++){
            nums[i] = sc.nextInt();
            max = Math.max(max, nums[i]);
        }

        boolean[] arr = new boolean[max+1];
        for(int i=2; i<=max; i++){
            if(!arr[i])
                for(int j=2; i*j<=max; j++) arr[i*j] = true;
        }

        for(int num : nums){
            int count = 0;
            for(int j=2; j<=num/2; j++){
                if(!arr[j] && !arr[num-j]) count ++;
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
        sc.close();

    }  
}
