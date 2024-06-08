import java.util.*;
import java.io.*;

public class Main_B10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001]; 
        
        // 카운팅 정렬
        for(int i=0; i<N; i++){
            int index = Integer.parseInt(br.readLine());
            count[index] += 1;
        }
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        
        System.out.print(sb);
        br.close();
    }
}
