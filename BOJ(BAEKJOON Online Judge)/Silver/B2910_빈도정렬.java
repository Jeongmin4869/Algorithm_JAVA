import java.util.*;
import java.io.*;

class Main_B2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String C = st.nextToken();
        Map<String, Integer> counts = new HashMap<>();
        Map<String, Integer> index = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            String key = st.nextToken();
            if(!counts.containsKey(key)){
                index.put(key, i);
            }
            counts.put(key, counts.getOrDefault(key, 0)+1);
        }

        List<String> keys = new ArrayList<>(counts.keySet());
        Collections.sort(keys, (o1, o2) -> {
            if(counts.get(o2).equals( counts.get(o1)))
                return index.get(o1) - index.get(o2);
            return counts.get(o2) - counts.get(o1);
        });

        StringBuilder sb = new StringBuilder();
        for(String key : keys){
            for(int i=0; i<counts.get(key); i++){
                sb.append(key + " ");
            }
        }
        
        System.out.print(sb);
    }
}
