import java.util.*;
import java.io.*;

class Main_B1063 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String king = st.nextToken();
        String stone = st.nextToken();

        int N = Integer.parseInt(st.nextToken());

        int kx = king.charAt(0)-'A';
        int ky = king.charAt(1)-'1';
        int sx = stone.charAt(0)-'A';
        int sy = stone.charAt(1)-'1';
        
        for(int i=0; i<N; i++){
            String m = br.readLine();
            int dx = 0;
            int dy = 0;
            for(int j=0; j<m.length(); j++){
                switch (m.charAt(j)) {
                    case 'R': dx += 1; break;
                    case 'L': dx -= 1; break;
                    case 'B': dy -= 1; break;
                    case 'T': dy += 1; break;
                }
            }

            int kkx = kx + dx;
            int kky = ky + dy;
            
            if(kkx >= 0 && kkx < 8 && kky >= 0 && kky < 8){
                if(kkx == sx && kky == sy){
                    int ssx = sx + dx;
                    int ssy = sy + dy;
                    if(ssx >= 0 && ssx < 8 && ssy >= 0 && ssy < 8){
                        kx = kkx;
                        ky = kky;
                        sx = ssx;
                        sy = ssy;
                    }
                }
                else {
                    kx = kkx;
                    ky = kky;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append((char)('A'+kx) + String.valueOf(ky+1)).append("\n");
        sb.append((char)('A'+sx) + String.valueOf(sy+1));
        System.out.print(sb);
      
    }

}
