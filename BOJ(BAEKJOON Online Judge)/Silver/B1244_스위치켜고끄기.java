import java.util.*;
import java.io.*;

class Main_B1244 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if(gender==1){
                for(int j=num; j<=N; j+=num){
                    arr[j] = (arr[j]+1)%2;
                }
            }
            else if(gender==2){
                arr[num] = (arr[num]+1)%2;
                for(int j=1; j<=N; j++){
                    if((num-j)>=1 &&(num+j)<=N && arr[num-j]==arr[num+j]){
                        arr[num+j] = (arr[num+j]+1)%2;
                        arr[num-j] = (arr[num-j]+1)%2;
                    }
                    else {
                        break;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++){
            sb.append(arr[i]+ " ");
            if(i%20==0) sb.append("\n");
     
        }
        
        System.out.println(sb);
    }
}
