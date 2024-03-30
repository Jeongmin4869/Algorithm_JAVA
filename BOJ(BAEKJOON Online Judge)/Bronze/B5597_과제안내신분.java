import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_B5597 {
    public static void main(String[] args){
        List<Integer> list  = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<28; i++){
            list.add(sc.nextInt());
        }
        for(int i=1; i<=30; i++){
            if(!list.contains(i))
                System.out.println(i);
        }
    }
}
