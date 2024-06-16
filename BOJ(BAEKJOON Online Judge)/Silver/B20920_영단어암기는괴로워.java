import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_B20920 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());        
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.length() < M) continue;
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        
        List<String> keySet = new ArrayList<>(map.keySet());

        keySet.sort((o1, o2) ->  {
            // 1. 자주 나오는 단어일수록 앞에 배치한다.
            if(map.get(o1) != map.get(o2))
                return map.get(o2).compareTo(map.get(o1));
            
            // 2. 해당 단어의 길이가 길수록 앞에 배치한다.
            if(o1.length() != o2.length())
                return o2.length() - o1.length();
            
            // 3. 알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다
            return o1.compareTo(o2);
        });

        StringBuilder sb = new StringBuilder();
        for(String key : keySet){
            sb.append(key).append("\n");
        }

        System.out.print(sb);
        sc.close();
        
    }
}
