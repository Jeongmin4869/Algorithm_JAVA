import java.util.*;

public class Main_B5073 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        Arrays.sort(arr);

        if(arr[0] == 0 && arr[2] == 0) break;
            
        if(arr[0] + arr[1] <= arr[2]) System.out.println("Invalid");
        else if (arr[0] == arr[1] && arr[1] == arr[2]) System.out.println("Equilateral");
        else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]) System.out.println("Isosceles");
        else if (arr[0] < arr[1] && arr[1] < arr[2]) System.out.println("Scalene");
        }
            
        sc.close();
    }
}
