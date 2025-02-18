import java.util.*;
import java.io.*;

class Main_B2578 {
    static int[][] arr;
    static boolean[][] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        arr = new int[5][5];
        visited = new boolean[5][5];
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                count += 1;
                int now = Integer.parseInt(st.nextToken());
                if(checkBingo(now)){
                    System.out.print(count);
                    return;
                }
            }
        }
    }

    public static boolean checkBingo(int num){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(arr[i][j] == num){
                    visited[i][j] = true;
                    if((checkrow() + checkcel() + checkcro1() + checkcro2())>=3){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int checkcel(){
        int count = 0;
        for(int i=0; i<5; i++){
            int check = 0;
            for(int j=0; j<5; j++){
                if(!visited[i][j]) break;
                check += 1;
            }
            if(check==5) count += 1;
        }
        return count;
    }

    public static int checkrow(){
        int count = 0;
        for(int i=0; i<5; i++){
            int check = 0;
            for(int j=0; j<5; j++){
                if(!visited[j][i]) break;
                check += 1;
            }
            if(check==5) count += 1;
        }
        return count;
    }

    public static int checkcro1(){
        for(int i=0; i<5; i++){
            if(!visited[i][i]) return 0;
        }
        
        return 1;
    }

    public static int checkcro2(){
        for(int i=0; i<5; i++){
            if(!visited[i][4-i]) return 0;
        }
        return 1;
    }
}
