import java.util.*;
class Main_B1673 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            int k = Integer.parseInt(arr[1]);
            int sum = n;
            while(n>=k){
                sum += n/k;
                n = n%k + n/k;
            }
            sb.append(sum).append("\n");

        }
        
        System.out.print(sb);
    }
}
