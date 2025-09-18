import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][4];

        // arr[i][0] = 이름
        // arr[i][1] = 일
        // arr[i][2] = 월
        // arr[i][3] = 년도
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }
        
        Arrays.sort(arr, (o1, o2) -> {
            if((o1[3].equals(o2[3])) && (o1[2].equals(o2[2])))
                return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
            if(o1[3].equals(o2[3]))
                return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
            return o1[3].compareTo(o2[3]);
        });
        
        System.out.println(arr[N-1][0]);
        System.out.println(arr[0][0]);

    }
}
