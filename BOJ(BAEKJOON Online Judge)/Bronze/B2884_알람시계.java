import java.util.Scanner;

public class Main_B2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

        if(minute>=45){
            System.out.println(hour + " " + (minute-45));
        }
        else {
            System.out.println(((hour+23)%24) + " " + (minute+15));
        }
    }
}
