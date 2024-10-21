import java.util.*;
import java.io.*;

class Main_B1380 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 1;
        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N==0) break;
            String[] students = new String[N];
            List<Integer> nums = new ArrayList<>();
            for(int i=0; i<N; i++){
                students[i] = br.readLine();
            }

            for(int i=0; i<(2*N-1); i++ ){
                StringTokenizer st = new StringTokenizer(br.readLine());
                Integer num = Integer.parseInt(st.nextToken());
                if(nums.contains(num)){
                    nums.remove(num);
                }
                else{
                    nums.add(num);
                }
                
            }
            sb.append(count + " "+ students[nums.get(0)-1] + "\n");
            count += 1;
            
        }
        System.out.println(sb);
    }
}
