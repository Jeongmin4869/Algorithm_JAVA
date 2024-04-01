import java.util.Scanner;
import java.util.stream.*;

public class Main_B10811 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int count = sc.nextInt();

        int[] arr = IntStream.rangeClosed(1, max).toArray();

        for(int n=0; n<count; n++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;

            while(i < j) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
