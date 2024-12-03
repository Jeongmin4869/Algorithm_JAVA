import java.util.*;
import java.io.*;

class Main_B1384 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while(true){
            count += 1;
            
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;

            String[] names = new String[n];
            boolean[][] messages = new boolean[n][n];
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                names[i] = name;
                for(int j=0; j<n-1; j++){
                    if(st.nextToken().equals("N")){
                        messages[i][j] = true;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append("Group "+count).append("\n");
            boolean hasNasty = false;
            for(int i=0; i<n; i++){
                for(int j=0; j<n-1; j++){
                    if(messages[i][j]){
                        hasNasty = true;
                        int index = (i+n-j-1)%n;
                        sb.append(names[index] + " was nasty about " + names[i]);
                        sb.append("\n");
                    }
                }
            }

            if(!hasNasty) sb.append("Nobody was nasty").append("\n");
            System.out.println(sb);
        }

    }
}
