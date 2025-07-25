import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        char arr[][] = new char[M][N];

        for(int i=0; i<M; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb ;
        for(int i=0; i<M; i++){    
            sb = new StringBuilder();
            for(int j=0; j<N; j++){
                char c = arr[i][j];
                for(int b=0; b<B; b++){
                    sb.append(c);
                }
            }

            for(int a=0; a<A; a++){
                System.out.println(sb);
            }
        }
        
    }
}
