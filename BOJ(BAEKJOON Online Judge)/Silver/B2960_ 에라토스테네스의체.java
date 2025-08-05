import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[1001];
        int count = 0;
        for(int i=2; i<=N; i++){
            if(!arr[i]){
                for(int j=1; i*j<=N; j++){
                    if(!arr[i*j]){
                        count += 1;
                        arr[i*j] = true;                        
                    }
                    if(count == K){
                        System.out.print(i*j);
                        return;
                    }
                }
            }
        }
    }

}
