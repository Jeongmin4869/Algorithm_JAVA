import java.util.*;
import java.io.*;

class Main_B16139 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] al = new int[str.length()][26];
        al[0][str.charAt(0)-'a']+=1;
        for(int i=1; i<str.length(); i++){
            al[i][str.charAt(i)-'a']+=1;{
                for(int j=0; j<26; j++){
                    al[i][j] += al[i-1][j];
                }
            }
        }

        for (int i=0; i<N;i++ ) {
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            if(s==0) sb.append(al[e][c-'a']).append("\n");
            else sb.append(al[e][c-'a']-al[s-1][c-'a']).append("\n");
        }
        
        System.out.println(sb);
    }
}
