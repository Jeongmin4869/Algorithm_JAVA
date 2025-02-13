import java.util.*;
import java.io.*;

class Main_B2511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = new String[10];
        String[] B = new String[10];
        A = br.readLine().split(" ");
        B = br.readLine().split(" ");

        String last = "D";
        int awin = 0;
        int bwin = 0;
        for(int i=0; i<10; i++){
            int aa = Integer.parseInt(A[i]);
            int bb = Integer.parseInt(B[i]);
            if(aa>bb){
                awin += 3;
                last = "A";
            }
            else if(aa<bb){
                bwin += 3;
                last = "B";
            }
            else if(aa==bb){
                awin += 1;
                bwin += 1;
            }
        }

        System.out.println(awin + " " + bwin);
        if(awin==bwin){
            if(awin==10) System.out.print("D");
            else System.out.print(last);
        }
        else if(awin>bwin){
            System.out.print("A");
        }
        else if(awin<bwin){
            System.out.print("B");
        }
    }
}
