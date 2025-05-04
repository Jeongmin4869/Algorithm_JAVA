import java.util.*;
import java.io.*;

class Main_B2659 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] inputArr = new int[4];
        for(int i=0; i<4; i++){
            inputArr[i] = Integer.parseInt(st.nextToken());
        }

        int std = 9999;
        for(int i=0; i<4; i++){
            int now = inputArr[i%4]*1000 + inputArr[(i+1)%4]*100 + inputArr[(i+2)%4]*10 + inputArr[(i+3)%4];
            std = Math.min(now, std);
        }

        
        Set<Integer> set = new TreeSet<>();
        for(int i=1111; i<=9999; i++){
            int min = 9999;

            String str = String.valueOf(i);
            if(str.contains("0")) continue;
            
            int[] arr = new int[4];
            arr[0] = i/1000;
            arr[1] = i/100%10;
            arr[2] = i/10%10;
            arr[3] = i%10;            
            for(int j=0; j<4; j++){
                int now = arr[j%4]*1000 + arr[(j+1)%4]*100 + arr[(j+2)%4]*10 + arr[(j+3)%4];
                min = Math.min(now, min);
            }
            set.add(min);
        }

        int count = 0;
        for(int s : set){
            count += 1;
            if(s == std) break;            
        }
        
        System.out.println(count);
        
    }
}
