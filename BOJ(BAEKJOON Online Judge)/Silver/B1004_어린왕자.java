/*
import java.util.*;
import java.io.*;

class Main_B1004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double sx = Double.parseDouble(st.nextToken());
            double sy = Double.parseDouble(st.nextToken());
            double ex = Double.parseDouble(st.nextToken());
            double ey = Double.parseDouble(st.nextToken());
            int n = Integer.parseInt(br.readLine());
            List<int[]> list = new ArrayList<>();
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                list.add(new int[] {x, y, r});
            }

            int result = 0;
            result = func(sx, sy, ex, ey, list);
            sb.append(result).append("\n");
        }

        System.out.println(sb);
        br.close();
        
    }

    public static int func(double sx, double sy, double ex, double ey, List<int[]> list){
        int result = 0;
        for(int i=0; i<list.size(); i++){
            int x = list.get(i)[0];
            int y = list.get(i)[1];
            int r = list.get(i)[2];
            double dx1 = Math.sqrt((sx-x)*(sx-x) + (sy-y)*(sy-y));
            double dx2 = Math.sqrt((ex-x)*(ex-x) + (ey-y)*(ey-y));
            if(dx1>r && dx2<=r){
                result += 1;
            }
            else if(dx1<=r && dx2>r){
                result += 1;
            }
        }
        return result;   
    }
    
}

*/

import java.util.*;
import java.io.*;

class Main_B1004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double sx = Double.parseDouble(st.nextToken());
            double sy = Double.parseDouble(st.nextToken());
            double ex = Double.parseDouble(st.nextToken());
            double ey = Double.parseDouble(st.nextToken());
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                boolean start = checkInside(sx, sy, x, y, r);
                boolean end = checkInside(ex, ey, x, y, r);
                if(start ^ end){
                    count += 1;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
        br.close();
        
    }

    public static boolean checkInside(double px, double py,int cx, int cy, int r){
        double dx = Math.sqrt((px-cx)*(px-cx) + (py-cy)*(py-cy));
        if(dx<=r) return true;
        return false;
    }
    
}

