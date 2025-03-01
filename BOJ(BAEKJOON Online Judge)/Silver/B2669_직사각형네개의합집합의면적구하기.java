import java.util.*;
import java.io.*;

class Main_B2669 {
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        boolean[][] arr = new boolean[100][100];
        int count = 0;
        for(int i=0; i<4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());
            for(int j=sx; j<ex; j++){
                for(int k=sy; k<ey; k++){
                    if(!arr[j][k]){
                        arr[j][k] = true;                    
                        count += 1;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
