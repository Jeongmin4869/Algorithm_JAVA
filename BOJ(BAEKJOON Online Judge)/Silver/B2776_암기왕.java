import java.util.*;
import java.io.*;

class Main_B2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++){

            int a = Integer.parseInt(br.readLine());
            Set<Integer> set = new HashSet<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<a; j++){
                set.add(Integer.parseInt(st.nextToken()));
            }

            int b = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int k=0; k<b; k++){
                int num = Integer.parseInt(st.nextToken());
                sb.append(set.contains(num)?1:0).append("\n");
                
            }
        }
        System.out.println(sb);
    }
}
