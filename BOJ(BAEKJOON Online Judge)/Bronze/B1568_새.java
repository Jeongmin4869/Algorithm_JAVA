import java.util.*;

class Main_B1568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int time = 0;
        int count = 1;
        while(N>0){
            long now = (long)count*(count+1)/2; 
            if(N==now){
                time += count;
                N-=now;
            }
            else if(N<now){
                N-= (long)count*(count-1)/2;
                time += (count-1);
                count = 1;
            }
            else {
                count += 1;
            }
        }
        
        System.out.println(time);
    }
}
