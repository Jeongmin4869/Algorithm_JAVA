import java.util.Scanner;
import java.util.stream.*;

public class Main_B10813 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count = sc.nextInt();
        int idx1, idx2, temp;
        int[] arr = IntStream.rangeClosed(1, size).toArray();

        for(int i=0; i<count; i++){
            idx1 = sc.nextInt();
            idx2 = sc.nextInt();
            temp = arr[idx1-1];
            arr[idx1-1] = arr[idx2-1];
            arr[idx2-1] = temp;
        }

        for(int i=0; i<arr.length; i++){
            if(i == arr.length-1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + " ");
        }
    }
}
