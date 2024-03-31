import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_B3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int num = 0;
        for(int i=0; i<10; i++){
            num = sc.nextInt();
            set.add(num % 42);
        }
        System.out.print(set.size());
    }
}
