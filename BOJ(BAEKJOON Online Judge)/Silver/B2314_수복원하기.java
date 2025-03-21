import java.util.*;
import java.io.*;

class Main_B2312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[100001];
        for(int i=2; i<=100000; i++){
            if(!arr[i]){
                for(int j=2; j*i<=100000; j++){
                    arr[j*i] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            int now = num;
            for(int j=2; j<=num ; j++){
                
                
                if(now%j==0){
                    int count = 0;
                    while(now%j==0){
                        now /= j;
                        count += 1;
                    }
                    sb.append(j + " " + count).append("\n");
                }
                if(now <= 1){
                    break;
                }
            }
        }
        
        System.out.println(sb);
    }
}
