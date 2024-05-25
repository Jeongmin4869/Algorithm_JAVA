/* 1. HashMap 사용 */
/*    시간복잡도 O(N1 + N2) */

import java.util.*;
public class Main_B1269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        Map<Integer, Integer> map = new HashMap<>();
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int count = 0;
        sc.nextLine();
        for(int i=0; i<N1; i++){
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        sc.nextLine();
        for(int i=0; i<N2; i++){
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            if(map.get(key) == 1) count += 1;
        }

        System.out.println(count);

        
        sc.close();
        
    }

    
}
