import java.util.*;
import java.io.*;

class Main_B1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());
        int rank = 1;
        for(int i=0; i<N; i++){
            if(arr[i] > score) rank += 1;
        }
        if(N==P && score <= arr[P-1]) System.out.print(-1);
        else System.out.print(rank);
    }
}
