import java.util.*;
import java.io.*;

class Main_B2799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[][] arr = new String[n*5+1][m*5+1];
        for(int i=0; i<arr.length; i++){
            arr[i] = br.readLine().split("");
        }

        int[] counts = new int[5];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int x = i*5 + 1;
                int y = j*5 + 1;
                int c = 0;
                for(int k=0; k<4; k++){
                    if(!arr[x+k][y].equals("*"))
                        break;
                    c += 1;
                }
                counts[c] += 1;
            }
        }

        for(int i=0; i<5; i++){
            System.out.print(counts[i] + " ");
        }
    }
}
