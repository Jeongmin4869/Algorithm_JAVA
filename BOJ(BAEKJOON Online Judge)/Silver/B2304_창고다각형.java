import java.util.*;
import java.io.*;

class Main_B2304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());

        List<int[]> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a =Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());
            list.add(new int[]{a,b});
        }

        // x 좌표 기준 정렬
        Collections.sort(list, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        // max값과 해당 값의 x좌표 찾기 (동일값이 있는 경우 x값이 큰 값으로 셋팅)
        int maxlen = 0;
        int maxidx = 0;
        for(int i=0; i<n; i++){
            if(list.get(i)[1] > maxlen){
                maxlen = list.get(i)[1];
                maxidx = i;
            }
        }

        // 왼쪽 면적
        int total = 0;
        int nowmax = 0;
        int s = 0;
        for(int i=0; i<=maxidx; i++){
            int nowx = list.get(i)[0];
            int nowh = list.get(i)[1];            
            if(nowh>nowmax){
                total += nowmax*(nowx-s);                
                nowmax = nowh;
                s = nowx;
            }            
        }


        // 오른쪽 면적
        nowmax = 0;
        s = list.get(n-1)[0];
        for(int i=n-1; i>=maxidx; i--){
            int nowx = list.get(i)[0];            
            int nowh = list.get(i)[1];            
            if(nowh > nowmax){
                total += nowmax * (s - nowx);
                s = nowx;
                nowmax = nowh;
            }            
        }

        // 기준이 되었던 max값
        total += maxlen;
                
        System.out.println(total);
    }
}
