import java.util.*;

// 1 3 4 9 10 ... 
class Main_B1740 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long result = 0;
        long num = 1;
        while(N>0){
            if(N%2 == 1){
                result += num;
            }
            N /= 2;
            num *= 3;
        }

        System.out.print(result);
        sc.close();
    }
}
