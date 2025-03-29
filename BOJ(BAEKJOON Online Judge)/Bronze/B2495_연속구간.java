import java.util.*;
import java.io.*;

class Main_B2495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<3; i++){
            String str = br.readLine();
            sb.append(check(str)).append("\n");
        }
        System.out.print(sb);    
    }

    public static int check(String str){
        int maxlen = 1;        
        String[] arr = str.split("");
        int[] len = new int[8];
        Arrays.fill(len, 1);
        for(int i=1; i<8; i++){
            if(arr[i-1].equals(arr[i])){
                len[i] = len[i-1] + 1;
                maxlen = Math.max(maxlen, len[i]);
            }
        }

        return maxlen;
    }
}
