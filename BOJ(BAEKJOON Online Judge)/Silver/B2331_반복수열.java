import java.util.*;
import java.lang.*;

class Main_B2331{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        list.add(A);
        int result = 0;
        while(true){
            int num = 0;
            while(A>0){
                num += Math.pow((A%10),P);
                A/=10;
            }
            
            if(list.indexOf(num)>=0){
                result = list.indexOf(num);
                break;
            }
            list.add(num);
            A = num;
        }
        
        System.out.println(result);
    }
}
