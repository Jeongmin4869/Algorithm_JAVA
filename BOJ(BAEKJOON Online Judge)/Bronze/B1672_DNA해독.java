import java.util.*;
import java.io.*;

class Main_B1672{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[4][4];
        arr[0] = new char[]{'A', 'C', 'A', 'G'};
        arr[1] = new char[]{'C', 'G', 'T', 'A'};
        arr[2] = new char[]{'A', 'T', 'C', 'G'};
        arr[3] = new char[]{'G', 'A', 'G', 'T'};

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char result = str.charAt(N-1);
        for(int i=2; i<=N; i++){
            result = arr[change(str.charAt(N-i))][change(result)];
        }
        System.out.println(result);
    }

    public static int change(char c){
        switch(c){
            case 'A':
                return 0;
            case 'G':
                return 1;
            case 'C':
                return 2;
            case 'T':
                return 3;
            default:
                return 0;
        }
    }

}
