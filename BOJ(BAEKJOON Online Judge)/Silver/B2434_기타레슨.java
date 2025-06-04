import java.util.*;
import java.io.*;

class Main_B2434 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int left = 0, right = 0;
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            right += arr[i];
            // 배열 내 가장 큰 값보다 작은 수로 분배할 수 없음. 
            // 기준이 되는 값은 가장 큰 값
            left = Math.max(left, arr[i]);
        }

        while(left<=right){
            int mid = (left + right ) /2;
            int count = check(N, arr, mid);
            // count가 초과하면 조절
            if(count>M){                                                    
                left = mid+1;
            }
            // 초과하지 않는다면 최소를 찾아 탐색
            else {
                right = mid-1;
            }
        }
        System.out.print(left);
    }

    public static int check(int N, int[] arr, int mid){
        int count = 0;
        int sum = 0;
        for(int i=0; i<N; i++){
            if(sum+arr[i]>mid){
                count += 1;
                sum = 0;
            }
            sum += arr[i];
        }
        if(sum >0) count += 1;
        return count ;
    }
}
