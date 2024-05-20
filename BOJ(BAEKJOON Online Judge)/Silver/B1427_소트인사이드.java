import java.util.*;

public class Main_B1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        char[] arr = sc.nextLine().toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        
        System.out.println(sb.reverse().toString());
        
        sc.close();
    }
    
}
