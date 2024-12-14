import java.util.*;
import java.io.*;

class Main_B1080 {
    static int N ;
    static int M ;
    static int[][] arr1 ;
    static int[][] arr2 ;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr1 = new int[N][M];
        arr2 = new int[N][M];

        for(int i=0; i<N; i++){
            String row = br.readLine();
            for(int j=0; j<M; j++){
                arr1[i][j] = row.charAt(j)-'0';
            }
        }
        
        for(int i=0; i<N; i++){
            String row = br.readLine();
            for(int j=0; j<M; j++){
                arr2[i][j] = row.charAt(j)-'0';
            }
        }

        int count = 0; 
        for(int i=0; i<=N-3; i++){
            for(int j=0; j<=M-3; j++){
                if(arr1[i][j] != arr2[i][j]){
                    count += 1;
                    filter(i, j, arr1);
                }
            }
        }

        if(!checkArr(arr1, arr2)) System.out.print(-1);
        else System.out.print(count);
        
    }

    public static void filter(int x, int y, int[][] arr){
        for(int i=x; i<x+3; i++){
            for(int j=y; j<y+3; j++){
                arr[i][j] = (arr[i][j]+1)%2;
            }
        }
    }

    public static boolean checkArr(int[][] A, int[][]B){
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                if(A[i][j] != B[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
