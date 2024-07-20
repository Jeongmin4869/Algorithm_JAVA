import java.util.*;
import java.io.*;

class Main_B2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long val = Long.parseLong(st.nextToken());
        long[] arr = new long[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] =Long.parseLong(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        System.out.print(binarySearch(arr, val));
        br.close();
    }

    public static long binarySearch(long[] arr, long target){
        long l =0;
        long h = arr[arr.length-1];
        long mid=0;
        while(l<=h){
            mid = (l+h)/2;
            long sum = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>mid) sum += arr[i]-mid;
            }
            if(sum>=target) l=mid+1;
            else if(sum<target) h=mid-1;
        }
        return h;
    }
}
