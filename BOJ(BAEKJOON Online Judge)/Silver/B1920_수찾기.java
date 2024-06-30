import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N1 = Integer.parseInt(br.readLine());
        int[] arr = new int[N1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int N2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N2; i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(arr, num)?1:0).append("\n");
        }
        System.out.print(sb);
        br.close();
    }

    public static boolean binarySearch(int[] arr, int target){
        int s=0; int e=arr.length-1;
        int index=0;
        while(s<=e){
            index=(s+e)/2;
            if(arr[index]==target) return true;
            else if(arr[index]<target) s=index+1;
            else e=index-1;           
        }
        return false;
    }
}
