import java.util.*;

class Main_B1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        sc.nextLine();
        for(int i=0; i<N; i++){
            arr1[i] = sc.nextInt();
        }
        sc.nextLine();
        for(int i=0; i<N; i++){
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        long sum = 0;
        for(int i=0; i<N; i++){
            sum += arr1[i] * arr2[N-1-i];
        }
        
        System.out.print(sum);
        sc.close();
    }

}
