import java.util.*;
public class Main_B1157 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            if(max < map.get(str.charAt(i))) max = map.get(str.charAt(i));

        }
        Character c = '?';
        int cnt = 0;
        for (Map.Entry<Character, Integer> tmpMap : map.entrySet()) {
            if (tmpMap.getValue() == max){
                cnt += 1;
                c = tmpMap.getKey();
            }
        }
        System.out.println(cnt > 1 ? "?" : c);
    }
}
