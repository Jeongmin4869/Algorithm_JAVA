import java.util.*;

class Main_B1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int min = b.length();

        for(int i=0; i<= b.length()-a.length(); i++){
            int sum = 0;
            for(int j=0; j<a.length(); j++){
                if(a.charAt(j) != b.charAt(i+j)) sum+=1;
            }
            if(min>sum) min=sum;
        }
        System.out.println(min);
        sc.close();
    }
}
