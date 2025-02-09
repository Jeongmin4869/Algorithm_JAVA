import java.util.*;
import java.io.*;

class Main_B2238{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int U = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        TreeMap<Integer, List<String>> m = new TreeMap<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int val = Integer.parseInt(st.nextToken());
            List<String> list = m.getOrDefault(val, new ArrayList<>());
            list.add(name);
            m.put(val, list);
        }
      
        String fname = "";
        int fval=0;
        int min = N;
        List<Integer> key = new ArrayList<>(m.keySet());
        for(int i=0; i<key.size(); i++){
            if(min>m.get(key.get(i)).size()){
                min = m.get(key.get(i)).size();
                fname = m.get(key.get(i)).get(0);
                fval = key.get(i);
            }
        }
        
        System.out.println(fname + " " +fval);
    }
}
