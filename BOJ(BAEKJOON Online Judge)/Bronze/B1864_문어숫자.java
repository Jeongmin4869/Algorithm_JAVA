import java.util.*;
import java.io.*;

class Main_B1864 {
    static Map<String, Integer> map;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new HashMap<>();
        map.put("-", 0);
        map.put("\\", 1);
        map.put("(", 2);
        map.put("@", 3);
        map.put("?", 4);
        map.put(">", 5);
        map.put("&", 6);
        map.put("%", 7);
        map.put("/", -1);
        
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            if(str.equals("#"))
                 break;
            sb.append(checkOctoNum(str)).append("\n");
        }

        System.out.println(sb);
    }

    public static int checkOctoNum(String str){
        String[] arr = str.split("");
        int sum = 0;
        int num = 1;
        for(int i=arr.length-1; i>=0; i--){
            sum += map.get(arr[i]) * num;
            num *= 8;
        }
        return sum;
    }

}
