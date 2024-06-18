import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_B28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String[] arr = br.readLine().split(" ");
            switch(arr[0]){
                case "1":
                    dq.addFirst(Integer.parseInt(arr[1]));
                    break;
                case "2":
                    dq.addLast(Integer.parseInt(arr[1]));
                    break;
                case "3":
                    sb.append(dq.isEmpty()?-1:dq.pollFirst()).append("\n");
                    break;
                case "4":
                    sb.append(dq.isEmpty()?-1:dq.pollLast()).append("\n");
                    break;
                case "5":
                    sb.append(dq.size()).append("\n");
                    break;
                case "6":
                    sb.append(dq.isEmpty()?1:0).append("\n");
                    break;   
                case "7":
                    sb.append(dq.isEmpty()?-1:dq.getFirst()).append("\n");
                    break;
                case "8":
                    sb.append(dq.isEmpty()?-1:dq.getLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
        
        br.close();
    }

}
