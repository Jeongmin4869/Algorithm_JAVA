import java.util.*;
import java.io.*;

class Main_B1331{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] visited = new boolean[6][6];
        boolean valid = true;
        int fristn = 0, firstm = 0;
        int prevn = 0, prevm = 0;
        for(int i=0; i<36; i++){
            String now = br.readLine();
            int n = now.charAt(0) - 'A';
            int m = now.charAt(1) - '1';
                        
            if(visited[n][m]){
                System.out.print("Invalid");
                return;
            }
            
            visited[n][m] = true; 

            if(i == 0) {
                fristn = n;
                firstm = m;
            }
            else if (!checkPos(n, m, prevn, prevm)){
                System.out.print("Invalid");
                return;
            }

            prevn = n;
            prevm = m;
            
        }
    
        if(!checkPos(prevn, prevm, fristn, firstm)) System.out.print("Invalid");
        else System.out.print("Valid");
        
    }    

    public static boolean checkPos(int x1, int y1, int x2, int y2){
        return (Math.abs(x1 - x2)==2 && Math.abs(y1 - y2) == 1)
            || (Math.abs(x1 - x2)==1 && Math.abs(y1 - y2) == 2);        
    }
}
