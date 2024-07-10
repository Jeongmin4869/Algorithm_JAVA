import java.util.*;
import java.io.*;

class Main_B2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[301];
        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] score = new int[301];
        score[1] = arr[1];
        score[2] = score[1]+ arr[2];
        for(int i=3; i<=N; i++){
            score[i] = Math.max(score[i-2]+arr[i],score[i-3]+arr[i-1]+arr[i] );
        }

        System.out.print(score[N]);
        br.close();
    }
}
