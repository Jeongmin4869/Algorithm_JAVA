import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> s = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            s.add(Integer.parseInt(st.nextToken()));
        }
        List<Integer> list = new ArrayList<>(s);
        Collections.sort(list);
        for(int i:list){
            System.out.print(i +" ");
        }
    }
}
