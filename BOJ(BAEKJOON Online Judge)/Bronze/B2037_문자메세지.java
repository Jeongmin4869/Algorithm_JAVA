import java.util.*;
import java.io.*;

class Main_B2037 {
    static int P, W;
    static String[] buttons = {" ", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        P = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        
        long time = countTime(br.readLine());

        System.out.println(time);
        br.close();
    }

    public static long countTime(String str){
        long time = 0;
        int nowbutton = -1;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            for(int j=0; j<9; j++){
                if(buttons[j].indexOf(c) != -1){
                    int click = buttons[j].indexOf(c)+1;
                    if(nowbutton==j&&j!=0){
                        time += W;
                    }
                    time += P*click;
                    nowbutton = j;
                    break;
                }
            }            
        }
        return time;
    }
}
