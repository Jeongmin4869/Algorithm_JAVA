import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        Arrays.sort(arr);
        
        // 가장 큰 변은 나머지 두 변의 합보다 작아야한다. 
        if((arr[0] + arr[1]) > arr[2]) answer = arr[0] + arr[1] + arr[2];
        else answer = arr[0] + arr[1] + (arr[0] + arr[1] - 1);
        
        System.out.println(answer);
        
        sc.close();
    }
}
