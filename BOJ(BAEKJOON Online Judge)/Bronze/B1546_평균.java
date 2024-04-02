import java.util.Scanner;
import java.util.stream.*;

public class Main_B1546 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        int max = 0;
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
            max = max < arr[i] ? arr[i] : max;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += (double)arr[i] / max * 100.0;
        }

        System.out.print(sum/count);
    }
}
