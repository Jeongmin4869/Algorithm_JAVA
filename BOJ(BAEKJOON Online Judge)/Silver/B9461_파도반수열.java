import java.util.*;

class Main_B9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] nums = new int[N];

        int max = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
            max = Math.max(max, nums[i]);
        }
        
        long[] arr = new long[101];        
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;
        arr[5] = 2;
        
        for (int i = 6; i <= max; i++) {
            arr[i] = arr[i - 1] + arr[i - 5];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(arr[nums[i]]);
        }
        
        sc.close();
    }
}
