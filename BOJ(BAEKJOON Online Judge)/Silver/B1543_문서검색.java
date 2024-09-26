import java.util.*;

class Main_B1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        String sub = sc.nextLine();

        int count = 0;
        for(int i=0; i<=str.length()-sub.length();){
            if(str.substring(i, i+sub.length()).equals(sub)){
                count += 1;
                i += sub.length();
            }
            else i++;
        }
        
        System.out.println(count);
    }
}
