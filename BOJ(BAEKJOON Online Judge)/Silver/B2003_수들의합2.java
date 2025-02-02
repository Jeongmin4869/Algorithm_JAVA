/*    

// 투포인터 -> 투포인터는 정렬된 배열에 사용하는것이 좋다 

import java.util.*;
import java.io.*;

class Main_B2003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int l=0, r=0;
        int sum = 0;
        while(l<N){
            if(r<N && sum < M){
                sum += arr[r];
                r += 1;
            }     
            else{
                sum -= arr[l];
                l += 1;
            }       
            if(sum == M){
                count += 1;               
            }            
        }
        System.out.println(count);
    } 
}

*/

// 누적합 -> 정렬되지 않은 배열

import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i=1; i<=N; i++){
            for(int j=0; j<i; j++){
                if((arr[i] - arr[j]) == M) count += 1;
            }
        }
        System.out.println(count);
    } 
}
