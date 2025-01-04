import java.util.*;
import java.io.*;

class Main_B24060 {
    static int N, K;
    static int num;
    static int count;
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        num = -1;
        count = 0;
        merge_sort(0, N-1, arr);
        System.out.print(num);
        
    }

    public static void merge_sort(int p, int r, int[] arr){

        if(p<r){
            int mid = (p+r)/2;
            merge_sort(p, mid, arr);
            merge_sort(mid+1, r, arr);
            merge(p, mid, r, arr);
        }
        
    }

    public static void merge(int p, int mid, int r, int[] arr){
        int i = p;
        int j = mid+1;
        int t = 0;
        int[] temp = new int[r-p+1];
        while(i <= mid && j <= r){
            if(arr[i] <= arr[j]){
                temp[t++] = arr[i++];
            }
            else {
                temp[t++] = arr[j++];
            }
        }
        while (i<=mid){
            temp[t++] = arr[i++]; 
        }
        while(j<=r){
            temp[t++] = arr[j++];
        }

        i = p;
        t = 0;

        while(i<=r){
            arr[i++] = temp[t++];
            count += 1;
            if(count == K){
                num = arr[i-1];
            }
        }   
    }
}
