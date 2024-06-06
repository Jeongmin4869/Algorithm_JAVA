import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] count = new int[10001]; 
        
        // 카운팅 정렬
        for(int i=0; i<N; i++){
            int index = sc.nextInt();
            count[index] += 1;
        }
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        
        System.out.print(sb);
        sc.close();
    }
}
