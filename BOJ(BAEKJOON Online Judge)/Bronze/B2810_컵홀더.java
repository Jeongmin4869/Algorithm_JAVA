import java.util.*;
import java.io.*;

class Main_B2810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] seats = br.readLine().split("");
        int holders = 1;//맨왼쪽
        for(int i=0; i<seats.length; i++){
            if(seats[i].equals("S")){
                holders += 1;
            }
            if(seats[i].equals("L")){
                holders += 1;
                i++;
            }
            
        }
        System.out.println(Math.min(n, holders));
    }
}
