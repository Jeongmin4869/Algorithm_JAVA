import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B2484 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int max = 0;

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[4];
            for(int j=0; j<4; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int a = arr[0];
            int b = arr[1];
            int c = arr[2];
            int d = arr[3];

            int nowval = 0;
            if(a==b && c==d && b==c){
                nowval = 50000 + a*5000;
            }
            else if(b==c && (a==c||b==d)){
                nowval = 10000 + b*1000;
            }
            else if((a==b)&&(c==d)){
                nowval = 2000 + b*500 + d*500;
            }else if(a==b){
                nowval = 1000 + a*100;
            }else if(b==c){
                nowval = 1000 + b*100;
            }else if(c==d){
                nowval = 1000 + c*100;
            }else {
                nowval = d*100;
            }
            
            max = Math.max(max, nowval);
        }
        
        System.out.println(max);
    }
}
