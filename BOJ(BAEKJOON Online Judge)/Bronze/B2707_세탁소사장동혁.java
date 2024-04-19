import java.util.*;
public class Main_B2707 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {25, 10, 5, 1};
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            for(int j=0; j<arr.length; j++){
                System.out.print(num / arr[j] + " ");
                num %= arr[j];
            }
            System.out.println();
        }
        sc.close();
    }
}
