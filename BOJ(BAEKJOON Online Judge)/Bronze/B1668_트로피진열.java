import java.util.*;

class Main_B1668 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int left = 0, right=0;
        int max1=0, max2=0;
        for(int i=0; i<N; i++){
            if(arr[i]>max1){
                max1 = arr[i];
                left+=1;
            }
            if(arr[N-i-1]>max2){
                max2=arr[N-i-1];
                right += 1;
            }
        }
        System.out.print(left+"\n"+right);
        sc.close();
        
    }
}
