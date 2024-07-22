import java.util.*;
import java.io.*;

class Main_B1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        long N = Long.parseLong(st.nextToken());
        long[] arr = new long[k];
        for(int i=0; i<k; i++){
            arr[i] =Long.parseLong(br.readLine());
        }
        
        Arrays.sort(arr);
        
        System.out.print(binarySearch(arr, N));
        br.close();
    }

    public static long binarySearch(long[] arr, long target){
        long l =1;
        long h = arr[arr.length-1];
        long mid=0;
        while(l<=h){
            long sum=0;
            mid = (h+l)/2;
            for(int i=0; i<arr.length; i++){
                sum += arr[i]/mid;
            }
            if(sum<target) h=mid-1;
            else if(sum>=target) l=mid+1;
        }
        return h;
    }
}
