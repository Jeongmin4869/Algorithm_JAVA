import java.util.*;
import java.io.*;

class Main_B2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        List<Integer> vlist = new ArrayList<>();
        List<Integer> hlist = new ArrayList<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int line = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if(line == 0){
                hlist.add(num);
            }
            else {
                vlist.add(num);
            }
        }

        vlist.add(0);
        vlist.add(W);
        hlist.add(0);
        hlist.add(H);
        Collections.sort(vlist);
        Collections.sort(hlist);
        int mw = 0, mh = 0;
        for(int i=1; i<hlist.size(); i++){
            int len = hlist.get(i)-hlist.get(i-1);
            if(len>mh) mh = len;
        }
        for(int i=1; i<vlist.size(); i++){
            int len = vlist.get(i)-vlist.get(i-1);
            if(len>mw) mw = len;
        }
        
        
        System.out.println(mw*mh);
    }
}
