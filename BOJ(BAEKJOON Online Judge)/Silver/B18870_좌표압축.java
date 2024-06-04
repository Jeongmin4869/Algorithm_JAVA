import java.util.*;

public class Main_B18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i =0; i< N ; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int i =0; i< N ; i++){
            if(!map.containsKey(sorted[i]))
                map.put(sorted[i], index++);
        }
        
        for(int i =0; i< N ; i++){
            sb.append(map.get(arr[i])).append(" ");
        }
        
        System.out.println(sb);
        
        sc.close();
    }
    
}
