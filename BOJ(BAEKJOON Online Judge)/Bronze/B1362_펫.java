import java.util.*;
import java.io.*;

class Main_B1362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;

        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int o = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            if(o == 0 && w == 0) break;

            while(true){
                st = new StringTokenizer(br.readLine());
                String c = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                
                if(c.equals("#")){
                    break;
                }

                if(c.equals("F") && w>0){
                    w += num;       
                }
                else if(c.equals("E")&&w>0){
                    w -= num;
                }
            }
            sb.append(count + " ");
            if(w <= 0) sb.append("RIP");
            else if(w > (o/2) && w < (o*2)) sb.append(":-)");
            else sb.append(":-(");
            sb.append("\n");
            count += 1;
            
        }
        
        System.out.println(sb);
        br.close();
    }
}
