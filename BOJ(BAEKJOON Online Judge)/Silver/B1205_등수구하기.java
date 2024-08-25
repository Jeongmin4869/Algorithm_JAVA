import java.util.*;
import java.io.*; // BufferedReader, InputStreamReader

class Main_B1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[N];
        
        // 등수가 비어있는 경우 Null Pointer Exception 발생 => 예외처리
        if(N>0){
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, Collections.reverseOrder());
        int rank = 1;
        for(int i=0; i<N; i++){
            if(arr[i] > score) rank += 1;
            else break;
        }
        if(N==P && score <= arr[P-1]) System.out.print(-1);
        else System.out.print(rank);
    }
}
