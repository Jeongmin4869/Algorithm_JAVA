import java.util.*;

public class Main_B1436 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0, count = 0;
        int number = 666;
        String six = "666";
        while(true){
           if(Integer.toString(number).contains(six)){
               count ++;
                if(count == N) break;
           }
            number ++;
        }
        System.out.println(number);
        
        sc.close();
    }
}
