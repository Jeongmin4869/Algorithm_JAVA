import java.util.Scanner;

public class Main_B1152 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        int count = str.length()==0?0:str.split(" ").length;
        System.out.println(count);
    }
}
