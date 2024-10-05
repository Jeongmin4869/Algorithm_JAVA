import java.util.*;
import java.io.*;

class Main_B1544 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        boolean[] visited = new boolean[N];
        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }

        int count = 0;
        for(int i=0; i<N; i++){
            if(visited[i]) continue;
            visited[i]=true;
            count += 1;
            String str = arr[i]+arr[i];
            for(int j=i+1; j<N; j++){
                if(!visited[j]&&str.contains(arr[j])){
                    visited[j] = true;
                }
            }
        }

        System.out.println(count);
        br.close();
    }
}
