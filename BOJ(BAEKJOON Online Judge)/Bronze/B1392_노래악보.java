import java.util.*;
import java.io.*;

class Main_B1392 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            int num = Integer.parseInt(br.readLine())+1;
            for(int j=1; j<=n; j++){
                num -= arr[j];
                if(num<=0){
                    sb.append(j).append("\n");
                    break;
                }
            }
        }

        System.out.print(sb);
    }
}
