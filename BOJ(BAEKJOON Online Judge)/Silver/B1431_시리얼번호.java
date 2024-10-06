import java.util.*
import java.io.*;

class Main_B1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            String str = br.readLine();
            int sum = 0;
            for(int j=0; j<str.length(); j++){
                char c = str.charAt(j);
                if(Character.isDigit(c)) sum += (c-'0');
            }
            map.put(str, sum);
        }

        List<String> keys = new ArrayList<>(map.keySet());

        Collections.sort(keys, (o1, o2)->{
            if(o1.length()!=o2.length())
                return o1.length()-o2.length();
            else if(!Objects.equals(map.get(o1), map.get(o2)))
                return map.get(o1)-map.get(o2);
            return o1.compareTo(o2);
        });

        StringBuilder sb = new StringBuilder();
       for(int i=0; i<N; i++){
           sb.append(keys.get(i)).append("\n");
       }
        
        System.out.println(sb);
        br.close();
    }
}
