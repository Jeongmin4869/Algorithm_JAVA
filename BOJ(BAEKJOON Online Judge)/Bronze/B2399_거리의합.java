/*

방법1. DFS -> 효율성 낮음 / 576ms

import java.util.*;
import java.io.*;

class Main {
    static long[] arr;
    static long sum;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new long[N];
        for(int i=0; i<N; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        sum = 0;
        dfs(0, 0);
        System.out.println(sum);
    }

    public static void dfs(long s, int count){
        if(count == 2){
            sum += Math.abs(s);
            return;
        }
        
        for(int i=0; i<N; i++){
            dfs( (arr[i]-s), count + 1);
        }
    }
}

*/

import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[N];
        for(int i=0; i<N; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sum += Math.abs(arr[i] - arr[j]);
            }
        }
        System.out.println(sum);
    }
}
