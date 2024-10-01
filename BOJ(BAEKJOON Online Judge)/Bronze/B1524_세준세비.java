import java.util.*;
import java.io.*;

class Main_B1524 {
    
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> S = new PriorityQueue<>();
        PriorityQueue<Integer> B = new PriorityQueue<>();
        
        for(int i=0; i<N; i++){
            br.readLine();
            S.clear();
            B.clear();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<s; j++){
                S.offer(Integer.parseInt(st.nextToken()));
            }
            
            st = new StringTokenizer(br.readLine());
            for(int k=0; k<b; k++){
                B.offer(Integer.parseInt(st.nextToken()));
            }
            String winner = start(S, B);
            sb.append(winner).append("\n");
        }

        System.out.println(sb);
    }

    public static String start(PriorityQueue<Integer> S, PriorityQueue<Integer> B){

        while(true){
            if(S.isEmpty() || B.isEmpty())
                break;

            if(S.peek() < B.peek()){
                S.poll();
            }
            else if (S.peek() > B.peek()){
                B.poll();
            }
            else{
                B.poll();
            }
        }

        if(S.size() >= 1){
            return "S";
        }
        else if (B.size() >= 1){
            return "B";
        }
        else {
            return "C";
        }
    }
}
