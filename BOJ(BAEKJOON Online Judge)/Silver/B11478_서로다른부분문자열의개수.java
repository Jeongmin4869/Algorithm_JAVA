import java.util.*;

public class Main_B11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        String str = sc.nextLine();
        for(int i=1; i<=str.length(); i++){
            for(int j=0; j+i<=str.length(); j++){
                set.add(str.substring(j, j+i));
            }
        }

        System.out.println(set.size());
        
        sc.close();
    }

}
