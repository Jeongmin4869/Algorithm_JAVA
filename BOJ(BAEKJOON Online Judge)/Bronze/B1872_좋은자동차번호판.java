import java.util.*;
import java.io.*;

class Main_B1872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            String[] arr = br.readLine().split("-");
            int a = checkEN(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if(Math.abs(a - b) <= 100) sb.append("nice\n");
            else sb.append("not nice\n");
        }
        
        System.out.print(sb);
    }

    static int checkEN(String EN){
        int sum = 0;
        for(int j = 0; j < EN.length(); j++){
            sum += (EN.charAt(j) - 'A') * Math.pow(26, 2 - j);
        }
        return sum;
    }
}
