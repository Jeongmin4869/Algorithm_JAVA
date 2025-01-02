import java.util.*;
import java.io.*;

class Main_B1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));

            if(d == 0.0&&r1==r2){
                sb.append(-1);
            }
            else if(d<Math.abs(r1-r2)|| d>(r1+r2)){
                sb.append(0);
            }
            else if(d == (r1+r2) || d==Math.abs(r1-r2)){
                sb.append(1);
            }
            else if(Math.abs(r1-r2)<d && d<(r1+r2)){
                sb.append(2);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
