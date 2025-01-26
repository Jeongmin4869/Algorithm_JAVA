import java.util.*;

class Main_2154{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nStr = String.valueOf(n);

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            sb.append(i);
        }
        
        System.out.println(sb.indexOf(nStr)+1);
    }
}
