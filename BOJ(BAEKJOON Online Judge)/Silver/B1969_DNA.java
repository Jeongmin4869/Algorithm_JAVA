import java.util.*;
import java.io.*;

class Main_B1969 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] arr = new String[N];
        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();        
        int count = 0;
        for(int i=0; i<M; i++){
            int[] al = new int[4];
            for(int j=0; j<N; j++){
                char c = arr[j].charAt(i);
                // 알파벳순으로 저장
                switch (c) {
                    case 'A': al[0] += 1; break;
                    case 'C': al[1] += 1; break;
                    case 'G': al[2] += 1; break;
                    case 'T': al[3] += 1; break;
                }
            }

            int max = 0;
            int nowindex = 0;
            for(int k=0; k<4; k++){
                if(al[k]>max){
                     nowindex = k;
                    max = al[k];
                }
            }

            switch (nowindex) {
                case 0: sb.append('A'); break;
                case 1: sb.append('C'); break;
                case 2: sb.append('G'); break;
                case 3: sb.append('T'); break;                
            }

            count += (N - max);

        }
        
        System.out.println(sb);
        System.out.println(count);
    }
    
}
