import java.util.*;
import java.io.*;

class Main_B2470 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]=Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        int s =0, e=N-1;
        long min = Long.MAX_VALUE;
        long[] result = new long[2];
        while(s<e){
            long left = arr[s];
            long right = arr[e];
            long num=right+left;
            if(Math.abs(num)<Math.abs(min)){
                min=num;
                result[0] = left;
                result[1] = right;
                if(min==0)break;
            }
            if(num>0) e-=1;
            else s+=1;
        }
        System.out.println(result[0]+" "+result[1]);
    }
}
