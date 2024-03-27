import java.util.Scanner;

public class Main_B10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int max =-1000000, min=1000000;
        for(int i =0; i<count; i++ ){
            int num = sc.nextInt();
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println(min+ " "+max);

    }
}
