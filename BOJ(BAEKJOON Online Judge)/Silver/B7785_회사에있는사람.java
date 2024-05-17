import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_B7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String flag = st.nextToken();
            if(flag.equals("enter")){
                map.put(name, 1);
            }else{
                map.put(name, 0);
            }
        }
        
        Set<String> set = map.keySet();
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        for(int i=0; i<list.size(); i++){
            if(map.get(list.get(i)) == 1){
                System.out.println(list.get(i));
            }
        }
        
        br.close();
    }
    
}
