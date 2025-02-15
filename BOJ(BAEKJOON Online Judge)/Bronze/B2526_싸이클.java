import java.util.*;
import java.io.*;

class Main_B2526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int result = 0;
        List<Integer> list = new ArrayList<>();
        list.add(N);
        int now = N;
        while(true){
            now = (now * N)%P;
            if(list.indexOf(now)>=0){
                result = list.size() - list.indexOf(now);
                break;
            }
            list.add(now);
        }
        
        System.out.println(result);
    }
}
