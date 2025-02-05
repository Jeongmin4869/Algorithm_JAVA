import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B2163 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = (N-1) * M + (M-1);
        System.out.println(result);
    }
}
