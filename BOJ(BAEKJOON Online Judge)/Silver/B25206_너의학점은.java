import java.util.Scanner;
import java.util.*;

public class Main_B25206 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Double> map = new HashMap<>();

        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        Double sum = 0.0;
        Double n = 0.0;
        for(int i=0; i<20; i++) {
            String str[] = sc.nextLine().split(" ");
            if(str[2].equals("P")) continue;
            sum += Double.parseDouble(str[1]) * map.get(str[2]);
            n += Double.parseDouble(str[1]);
        }

        System.out.print(sum / n);
        sc.close();
    }
}
