import java.util.*;
import java.io.*;

class P{
        int po;
        int price;
        public P(int po, int price){
            this.po = po;
            this.price = price;
        }
}

class Main_2466 {

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

        int count = 0;
        for(int i=0; i<N; i++){
            boolean flag = true;
            P cur = pp[i];
            for(int j=0; j<N; j++){
                if(i==j) continue;
                if(cur.po > pp[j].po && cur.price >= pp[j].price){
                    flag = false;
                    break;
                }
                else if(cur.price > pp[j].price && cur.po >= pp[j].po){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count += 1;
            }
        }
        System.out.print(count);
    }
}
