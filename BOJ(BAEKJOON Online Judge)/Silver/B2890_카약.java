import java.util.*;
import java.io.*;

class Main_B2890 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        String[] arr = new String[R];
        for(int i=0; i<R; i++){
            arr[i] = br.readLine();
        }
        int rank = 1;
        boolean plus = false;
        int[] ranks = new int[R+1];
        for(int i=C-2 ;i>0; i--){
            plus = false;
            for(int j=0; j<R; j++){
                String line = arr[j];
                if(line.charAt(i) != '.' && ranks[line.charAt(i)-'0'] == 0){
                    ranks[line.charAt(i)-'0'] = rank;
                    plus = true;
                }
            }            
            if(plus) rank += 1;
        }
        rank += 1;
        for(int i=1; i<=R; i++){
            if(ranks[i]==0) continue;
            else  System.out.println(ranks[i]);
        }
        
    }
}
