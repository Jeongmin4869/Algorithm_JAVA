import java.util.*;
import java.io.*;

class Main_B2508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++){
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            String[][] arr = new String[r][c];
            for(int j=0; j<r; j++){
                arr[j] = br.readLine().split("");
            }
            sb.append(count(r, c, arr)+"\n");
        }
        
        System.out.println(sb);
    }

    public static int count(int r, int c, String[][] arr){
        
        int cnt = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j].equals("o")){
                    if(j-1>=0 && j+1<c 
                              && arr[i][j-1].equals(">")
                              && arr[i][j+1].equals("<")){
                        cnt += 1;
                    }
                    else if(i-1>=0 && i+1<r 
                                   && arr[i-1][j].equals("v")
                                   && arr[i+1][j].equals("^")){
                        cnt += 1;
                    }
                }
            }
        }
        return cnt;
    }
}
