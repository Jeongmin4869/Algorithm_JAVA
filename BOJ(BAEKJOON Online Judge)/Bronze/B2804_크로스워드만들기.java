import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] A = st.nextToken().split("");
        String[] B = st.nextToken().split("");
        int idxa=0, idxb =0;
        boolean flag = false;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                if(A[i].equals(B[j])){
                    flag = true;
                    idxa = i;
                    idxb = j;
                    break;
                }
            }
            if(flag) break;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<B.length; i++){
            for(int j=0; j<A.length; j++){
                if(j==idxa) sb.append(B[i]);
                else if(i==idxb) sb.append(A[j]);
                else sb.append(".");
            }
            sb.append("\n");
        }

        
        System.out.println(sb);
    }
}
