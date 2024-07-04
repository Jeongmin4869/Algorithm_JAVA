import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B4779 {
    static String str = "";
    static StringBuilder sb ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s ;
        while((s=br.readLine())!=null){
            sb = new StringBuilder();
            int num = Integer.parseInt(s);
            for(int i=0; i<Math.pow(3,num); i++){
                sb.append("-");
            }
            func(0, sb.length());
            System.out.println(sb);
        }
        br.close();
    }

    public static void func(int start, int size){
        if(size == 1) return;
        int newSize = size/3;
        for(int i=start+newSize; i<start+newSize*2; i++){
            sb.setCharAt(i,' ');
        }
        func(start, newSize);
        func(start+newSize*2, newSize);
    }
}
