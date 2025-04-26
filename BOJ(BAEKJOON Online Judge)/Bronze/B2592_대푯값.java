 import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B2592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> m = new HashMap<>();
        int sum = 0;
        for(int i=0; i<10; i++){
            int num = Integer.parseInt(br.readLine());
            m.put(num, m.getOrDefault(num, 0)+1);
            sum += num;
        }

        List<Integer> key = new ArrayList<>(m.keySet());
        key.sort((o1, o2)->{
            return m.get(o2)-m.get(o1);
        });
        
        System.out.println(sum/10);
        System.out.println(key.get(0));
    }
}
