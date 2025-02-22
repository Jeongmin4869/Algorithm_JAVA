import java.util.*;
import java.io.*;

class Main_B2596 {
    static String[] nums = {"000000","001111","010011","011100","100110","101001","110101","111010"};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            String s = str.substring(i*6, i*6+6);
            boolean find = false;
            for(int j=0; j<nums.length; j++){
                int count = 0;
                for(int k=0; k<6; k++){
                    if(s.charAt(k) != nums[j].charAt(k)){
                        count += 1;
                    }
                    if(count > 1) break;
                }

                if(count <= 1){
                    sb.append((char)('A' + j));   
                    find = true;
                }     
            }
            if(!find){
                System.out.print(i+1);
                return;
            }
        }
        System.out.print(sb);
    }
}
