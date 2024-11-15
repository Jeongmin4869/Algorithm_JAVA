import java.util.*;
import java.io.*;

class Main_B1434 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] boxes = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            boxes[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int now = 0;
        int sum = 0;
        for(int j=0; j<m; j++){

            int book = Integer.parseInt(st.nextToken());
            while(now < n){
                if(boxes[now] >= book){
                    boxes[now] -= book;
                    break;
                }
                else {
                    sum += boxes[now];
                    now += 1;
                }
            }         
        }

        for(int k=now; k<n; k++){
            sum += boxes[k];
        }
        
        System.out.println(sum);
    }
}
