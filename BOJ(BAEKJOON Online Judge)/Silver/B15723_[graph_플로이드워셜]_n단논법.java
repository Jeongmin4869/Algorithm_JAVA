import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[26][26];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            int s = str.charAt(0)-'a';
            int e = str.charAt(str.length()-1)-'a';
            arr[s][e] = 1;
        }

        for(int k=0; k<26; k++){
            for(int i=0; i<26; i++){
                for(int j=0; j<26; j++){
                    if(arr[i][k]==1 && arr[k][j]==1){
                        arr[i][j] = 1;
                    }
                }
            }
        }

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String str = br.readLine();
            int s = str.charAt(0)-'a';
            int e = str.charAt(str.length()-1)-'a';
            if(arr[s][e]==1) System.out.println("T");
            else System.out.println("F");
        }
    }
}
