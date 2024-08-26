import java.util.*;

class Main_B1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str ;

        while(true){
            str = sc.nextLine();
            if(str.equals("0")) break;
            String s1 = str.substring((str.length()+1)/2);
            String s2 = (new StringBuilder(str).reverse().toString()).substring((str.length()+1)/2);
            if(s1.equals(s2)) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }
}
