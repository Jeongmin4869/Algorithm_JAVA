import java.util.*;
import java.io.*;

class Main_B1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Set<Integer> a = new HashSet<>();
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            a.add(num);
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int num = Integer.parseInt(st.nextToken());
            a.remove(num);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(a.size()+"\n");

        List<Integer> list = new ArrayList<>(a);
        Collections.sort(list);
        for(Integer num : list){
            sb.append(num + " ");
            
        }
        
        System.out.println( sb);
    }
}
