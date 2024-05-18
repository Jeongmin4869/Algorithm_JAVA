import java.util.*;

public class Main_B2751 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
        }

        // 선택정렬, 삽입정렬, 버블정렬 : O(n^2)
        // Collections.sort() : O(n) ~ O(nlogn)
        Collections.sort(list);
        
        for(int i=0; i<N; i++){
            sb.append(list.get(i)).append("\n");
            //System.out.println(list.get(i));
        }
        System.out.println(sb);
        sc.close();
    }
}
