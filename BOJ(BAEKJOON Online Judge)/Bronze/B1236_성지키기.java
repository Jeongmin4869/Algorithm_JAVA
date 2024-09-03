import java.util.*;
import java.io.*;

class Main_B1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[] cols = new boolean[m];
        int c = m, r = n;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'X' && !cols[j]) {
                    cols[j] = true;
                    c--;
                }
            }
            if (str.contains("X")) r--;
        }

        System.out.println(Math.max(r, c));
    }
}
