import java.util.*;
import java.lang.*;
import java.io.*;

class P{
        int po;
        int price;
        public P(int po, int price){
            this.po = po;
            this.price = price;
        }
}


// The main method must be in a class named "Main".
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        P[] pp = new P[N];
        
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int po = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            pp[i] = new P(po, price);
        }

        Arrays.sort(pp, (o1,o2)->{
            if(o1.po == o2.po)  
               return o1.price - o2.price;
            return o1.po-o2.po;
        });

        int count = 0;
        for(int i=0; i<N; i++){
            boolean flag = true;
            for(int j=0; j<N; j++){
                if(j<i && pp[j].price < pp[i].price){
                    flag = false;
                    break;
                }
                else if(j>i && pp[j].price > pp[i].price){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count += 1;
                System.out.println(i);
            }
        }
        System.out.print(count);
    }
}
