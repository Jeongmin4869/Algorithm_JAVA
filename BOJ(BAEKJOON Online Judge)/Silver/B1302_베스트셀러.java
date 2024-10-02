import java.util.*;
import java.io.*;

class Main_B1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0)+1);
        }

        List<String> keys = new ArrayList<>(map.keySet());
        keys.sort((o1, o2)->{
            if(map.get(o2)==map.get(o1)){
                return o1.compareTo(o2);
            }
            return map.get(o2)-map.get(o1);
        });
        
        System.out.println(keys.get(0));
        br.close();
    }
}
