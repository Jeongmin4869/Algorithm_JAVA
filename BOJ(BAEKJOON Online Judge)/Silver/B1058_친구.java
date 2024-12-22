import java.util.*;
import java.io.*;

class Main_B1058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int[] max = new int[N];

        // 직접친구
        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<N; j++){
                if(line.charAt(j)=='Y'){ // 직접친구
                    arr[i][j] = 1;
                    max[j] += 1;
                }
            }
        }

        // 2친구 
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] == 1){
                    for(int k=0; k<N; k++){
                        // k와 i가 친구, i와 j가 친구 -> k와 j가 친구 .. 
                        if(arr[k][i] == 1 && arr[k][j] == 0 && k != j ){
                            arr[k][j] = 2;
                            max[k] += 1;
                        }   
                    }
                }
            }
        }

        Arrays.sort(max);
        
        System.out.println(max[N-1]);
    }
}
