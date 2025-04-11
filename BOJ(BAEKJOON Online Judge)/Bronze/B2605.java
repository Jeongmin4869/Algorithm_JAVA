import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());        
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();        
        list.add(0);
        for(int i=1; i<=n; i++){
            int now = Integer.parseInt(st.nextToken());
            list.add(i-now, i);            
        }

        for(int i=1; i<=n; i++){
            System.out.print(list.get(i) + " ");
        }
        
    }
}
