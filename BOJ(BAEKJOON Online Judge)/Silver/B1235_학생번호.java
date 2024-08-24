import java.util.*;
import java.io.*;

class Main_B1235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }

        HashSet<String> s = new HashSet<>();
        int size =arr[0].length();
        for(int i=1; i<size; i++){
            s.clear();
            for(int j=0; j<N; j++){
                String str = arr[j].substring(size-i);
                if(!s.add(str)) break;
               
            }
            if(s.size()==N){
                System.out.println(i);
                return;
            }
        }

        System.out.println(size);
    
    }
}
