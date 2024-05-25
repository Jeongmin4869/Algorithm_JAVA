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


/* HashSet 사용 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 두 집합의 크기 입력
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        
        // 첫 번째 집합 입력
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < N1; i++) {
            set1.add(sc.nextInt());
        }
        
        // 두 번째 집합 입력
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < N2; i++) {
            set2.add(sc.nextInt());
        }
        
        // 합집합 구하기
        Set<Integer> allSet = new HashSet<>(set1);
        allSet.addAll(set2);
        
        // 교집합 구하기
        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        
        // 합집합에서 교집합 요소 제거하기 (대칭 차집합 구하기)
        allSet.removeAll(temp);
        
        // 결과 출력
        System.out.println(allSet.size());
        
        sc.close();
    }
}
