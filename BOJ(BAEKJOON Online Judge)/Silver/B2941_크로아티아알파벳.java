import java.util.Scanner;

public class Main_B2941 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "A");
        System.out.print(str.length());
        sc.close();
    }
}
