import java.util.*;
import java.io.*;

class Main_B1064 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x1 = Double.parseDouble(st.nextToken());
        double y1 = Double.parseDouble(st.nextToken());
        double x2 = Double.parseDouble(st.nextToken());
        double y2 = Double.parseDouble(st.nextToken());
        double x3 = Double.parseDouble(st.nextToken());
        double y3 = Double.parseDouble(st.nextToken());

        // 두 점 사이의 기울기 공식
        // 세 점의 기울기가 동일할 경우 한 선분 아에 있다는 의미임으로 평생사변형을 구할 수 없다. 
        double gra1 = (y1-y2) / (x1 - x2);
        double gra2 = (y3-y2) / (x3 - x2);
        if(gra1 == gra2){
            System.out.println(-1.0);
            return;
        }

        // 두 점 사이의 거리를 구하는 공식
        double dx1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double dx2 = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
        double dx3 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));

        double maxDx = Math.max((dx1+dx2), Math.max((dx1+dx3), (dx2+dx3))) * 2;
        double minDx = Math.min((dx1+dx2), Math.min((dx1+dx3), (dx2+dx3))) * 2;

        System.out.println(maxDx - minDx);
        
      
    }

}
