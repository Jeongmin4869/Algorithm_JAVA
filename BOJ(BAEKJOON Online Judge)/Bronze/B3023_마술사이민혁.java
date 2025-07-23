import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        char arr[][] = new char[M*2][N*2];
        for(int i=0; i<M; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        int a,  b;
        for(int i=0; i<M*2; i++){                    
            for(int j=0; j<N*2; j++){
                a = i;
                b = j;
                if(i>=M) a = 2*M-1-i;
                if(j>=N) b = 2*N-1-j;
                arr[i][j] = arr[a][b];                
            }
        }

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken())-1;
        b = Integer.parseInt(st.nextToken())-1;
        if(arr[a][b] == '.') arr[a][b] = '#';
        else if(arr[a][b] == '#') arr[a][b] = '.';

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M*2; i++){                    
            for(int j=0; j<N*2; j++){
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.print(sb);
        
    }

}
