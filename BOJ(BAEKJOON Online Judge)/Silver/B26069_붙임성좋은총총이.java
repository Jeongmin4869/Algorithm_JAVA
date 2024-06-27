import java.util.*;
import java.io.*;

class Main_B26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        Set<String> s = new HashSet<>();
        s.add("ChongChong");
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String p1 = st.nextToken();
            String p2 = st.nextToken();
            if(s.contains(p1)|| s.contains(p2)){
                s.add(p1);
                s.add(p2);
            } 
        }
        System.out.print(s.size());
        br.close();
    }
}
