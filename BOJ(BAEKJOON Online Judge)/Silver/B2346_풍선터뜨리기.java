import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Balloons{
    int index;
    int num;

    public Balloons(int index, int num){
        this.index = index;
        this.num = num;
    }
}

public class Main_B2346 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Balloons> dq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            dq.add(new Balloons(i, Integer.parseInt(st.nextToken())));
        }
        
        while(!dq.isEmpty()){

            Balloons current = dq.pollFirst();
            int num = current.num;
            int index = current.index;
            sb.append(index + " ");

            if(dq.isEmpty()) break;

        
            if(num > 0){
                for(int i=1; i<num; i++){
                    dq.add(dq.poll());
                }
            }
            else{
                for(int i=num; i<0; i++){
                    dq.addFirst(dq.pollLast());
                }
            }
        }
        
        System.out.println(sb.toString().trim());
        
        br.close();
    }

}
