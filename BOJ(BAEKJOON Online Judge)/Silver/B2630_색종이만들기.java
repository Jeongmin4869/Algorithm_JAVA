import java.util.*;
import java.io.*;

class Main_B2630 {
    static int N;
    static int white;
    static int blue;
    static int[][] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        white = 0;
        blue = 0;
        binary(0, 0, N);
    
        System.out.println(white);
        System.out.print(blue);

        br.close();
    }

    public static void binary(int x, int y, int size){
        int color = arr[x][y];
        boolean flag = true;
        
        for(int i=x; i<x+size; i++){
            for(int j=y; j<y+size; j++){
                if(arr[i][j] != color) {
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }

        if(flag == true){
            if(color == 1) blue += 1;
            else white += 1;
            return ;
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                binary(x+i*(size/2), y+j*(size/2), size/2);
            }
        }

        return;
        
    }
}
