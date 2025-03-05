import java.util.*;
import java.io.*;

class Main_B2456 {

    static class P{
        int index = 0;
        int sum = 0;
        int three = 0;
        int two = 0;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        P[] p = new P[3];

        for(int i=0; i<3; i++){
            p[i] = new P();
            p[i].index = i+1;
        }
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num == 3) p[j].three += 1;
                if(num == 2) p[j].two += 1;
                p[j].sum += num;
            }
        }

        Arrays.sort(p, (o1,o2)->{
            if(o2.sum == o1.sum) 
                return o2.three - o1.three;
            return o2.sum-o1.sum;  
        });


        int index = 0; int sum =0;
        if(p[0].sum>p[1].sum){
            index = p[0].index;
            sum = p[0].sum;
        }
        else if(p[0].sum==p[1].sum){
            if((p[0].three>p[1].three) || (p[0].two>p[1].two)){
                index = p[0].index;
            }
            else {
                index = 0;
            }
            sum = p[0].sum;
        }
        
        System.out.println(index + " "+ sum);
    }
}
