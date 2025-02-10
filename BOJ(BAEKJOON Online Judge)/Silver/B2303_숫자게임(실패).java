import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main_B2303 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int index = 0;
        int maxval = 0;
        StringTokenizer st ;
        for(int i=0; i<N; i++){
            int[] arr = new int[5];
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int now = check(arr);
            if((now%10 > maxval%10 )|| ((now%10 == maxval%10) && (now>maxval))){
                index = i+1;
                maxval = now;
            }
            
        }
        
        System.out.println(index);
    }

    public static int check(int arr[]){
        int max = 0;
        for(int i=0; i<3; i++){
            for(int j=i+1; j<4; j++){
                for(int k=j+1; k<5; k++){
                    int now = arr[i] + arr[j] + arr[k];
                    if(max%10 < now%10) max = now;
                }
            }
        }
        return max;
    }

    
}
