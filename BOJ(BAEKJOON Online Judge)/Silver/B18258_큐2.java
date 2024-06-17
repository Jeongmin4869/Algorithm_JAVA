import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_B18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        String str ;
        int back = 0;
        for(int i=0; i<N; i++){
            String[] arr = br.readLine().split(" ");
            str = arr[0];
            switch(str){
                case "push":
                    back = Integer.parseInt(arr[1]);
                    q.offer(back);
                    break;
                case "pop":
                    if(q.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(q.poll()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "front":
                    if(q.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(q.peek()).append("\n");
                    break;
                case "empty":
                    sb.append(q.isEmpty()?1:0).append("\n");
                    break;
                case "back":
                    if(q.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(back).append("\n");
                    break;   
            }
        }
        System.out.println(sb);
        
        br.close();
    }

}
