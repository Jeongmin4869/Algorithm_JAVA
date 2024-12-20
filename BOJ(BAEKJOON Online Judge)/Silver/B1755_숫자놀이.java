import java.util.*;
import java.io.*;

class Main_B1755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        String[] numStr = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map<Integer, String> map = new HashMap<>();
        for(int i=s; i<=e; i++){
            int num = i;
            String str = "";
            while(num > 0){
                str = numStr[(num%10)] + str;
                num /= 10;
            }
            map.put(i, str);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (o1, o2) -> {
            return map.get(o1).compareTo(map.get(o2));
        });

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(Integer key : keySet){
            count += 1;
            sb.append(key + " ");
            if(count == 10){
                count = 0;
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
