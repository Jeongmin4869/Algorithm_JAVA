import java.util.*;
import java.io.*;

class Main_B1894 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        while((str = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(str);
            double x1 = Double.parseDouble(st.nextToken());
            double y1 = Double.parseDouble(st.nextToken());
            double x2 = Double.parseDouble(st.nextToken());
            double y2 = Double.parseDouble(st.nextToken());
            double x3 = Double.parseDouble(st.nextToken());
            double y3 = Double.parseDouble(st.nextToken());
            double x4 = Double.parseDouble(st.nextToken());
            double y4 = Double.parseDouble(st.nextToken());

            // printf
            // 대각선 AC와 BD의 교점 M(두 대각선의 중점) 은 같다는 개념을 활용
            double xx = 0.0;
            double yy = 0.0;;
            // 1!=2 3!=4
            if(x1 == x3 && y1 == y3){
                xx = x2+x4-x1;
                yy = y2+y4-y1;
            } 
            else if(x1 == x4 && y1 == y4){
                xx = x2+x3-x1;
                yy = y2+y3-y1;
            } 
            else if(x2 == x3 && y2 == y3){
                xx = x1+x4-x2;
                yy = y1+y4-y2;
            }
            else if(x2 == x4 && y2 == y4){
                xx = x1+x3-x2;
                yy = y1+y3-y2;
            } 
            
            System.out.printf("%.3f %.3f\n", xx, yy);

        }              
    }
}
