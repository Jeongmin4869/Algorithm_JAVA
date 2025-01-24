import java.util.*;
import java.io.*;

class Main_B2160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int N = 5;
        int M = 7;
        String[][] arr = new String[N*num][M];
        for(int i=0; i<N*num; i++){
            arr[i] = br.readLine().split("");
        }

        int[] s = new int[]{1,2};
        int max = 0;
        for(int i=0; i<num; i++){
            for(int j=i+1; j<num; j++){

                int count =0;
                for(int k=0; k<N; k++){
                    for(int l=0; l<M; l++){
                        if(arr[i*5+k][l].equals(arr[j*5+k][l]))
                            count += 1;
                    }
                }

                if(count > max){
                    max = count;
                    s[0] = i+1;
                    s[1] = j+1;
                }
                
            }
        }

        System.out.println(s[0] + " " + s[1]);
    }
}
