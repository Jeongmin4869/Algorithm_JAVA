import java.util.*; 
import java.io.*;

class Main_B2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int result = 0;
        int min = arr[0];
        for(int i=1; i<=N; i++){
            if(result < arr[N-i]*i){
                result = arr[N-i]*i;
            }
        }
        System.out.print(result);
    }
}
