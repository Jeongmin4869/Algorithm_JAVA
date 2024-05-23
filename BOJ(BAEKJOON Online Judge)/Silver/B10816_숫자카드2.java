import java.util.*;

public class Main_B10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        int N = sc.nextInt();
        int num;
        for(int i=0; i<N; i++){
            num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        N = sc.nextInt();
        for(int i=0; i<N; i++){
            num = sc.nextInt();
            sb.append(map.getOrDefault(num, 0)).append(" ");
        }
        
        System.out.println(sb);
        sc.close();
    }
    
}
