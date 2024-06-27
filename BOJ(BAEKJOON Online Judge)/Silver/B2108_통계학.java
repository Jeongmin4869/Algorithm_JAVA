import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_B2108 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> m = new HashMap<>();
        int[] arr = new int[N];
        int sum = 0;
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[i] = num;
            m.put(num, m.getOrDefault(num, 0)+1);
        }

        Arrays.sort(arr);
        
        
        // 산술평균
        sb.append(Math.round((double)sum/N)).append("\n");
        // 중앙값
        sb.append(arr[N%2==0?N/2-1:N/2]).append("\n");
        // 최빈값
        int maxValue = Collections.max(m.values());
        List<Integer> list = new ArrayList<>();
        for(int key : m.keySet()){
            if(m.get(key) == maxValue) list.add(key);
        }
        Collections.sort(list);
        if(list.size()>1) sb.append(list.get(1)).append("\n");
        else sb.append(list.get(0)).append("\n");
        // 범위
        sb.append(Math.abs(arr[0]-arr[N-1])).append("\n");

        System.out.print(sb);
        
        br.close();
        
    }

}
