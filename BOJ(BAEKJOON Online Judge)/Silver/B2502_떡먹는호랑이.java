import java.util.*;
import java.io.*;

class Main_B2502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int a = 0;
        int b = 0;
        int[] arr = new int[D];
        arr[0] = arr[1] = 1;
        for(int i=2; i<=D; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }ㅁ
        for(int i=1; i<K; i++){
            int now = K -(i * arr[D-3]);
            if(now%arr[D-2]==0){
                a = i;
                b = now/arr[D-2];
                break;
            }
        }
        
        System.out.println(a);
        System.out.println(b);
    }
}
