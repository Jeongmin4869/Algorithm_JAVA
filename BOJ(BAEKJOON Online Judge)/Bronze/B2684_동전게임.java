import java.util.*;
import java.io.*;

class Main_B2684 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] cases = new String[] {
            "TTT", "TTH", "THT", "THH", 
            "HTT", "HTH", "HHT", "HHH"
        };

        for(int i=0; i<T; i++){
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();            
            for(int j=0; j<8; j++){
                int count = 0;
                for(int k=0; k<38; k++){
                    if(str.substring(k, k+3).equals(cases[j])) count += 1;
                }
                sb.append(count + " ");
            }
            System.out.println(sb);
        }
        
    }
}
