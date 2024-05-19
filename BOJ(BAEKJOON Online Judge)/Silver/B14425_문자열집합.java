import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_B14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // List<String> list = new ArrayList<>(); // O(N)
        Set<String> set = new HashSet<>(); // O(1)
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        
        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }
        
        for(int i=0; i<M; i++){
            if(set.contains(br.readLine())) count++;
        }
        
        System.out.println(count);
        
        br.close();
    }
    
}
