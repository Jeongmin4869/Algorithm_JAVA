import java.util.Scanner;

public class Main_B5622 {

    public static void main(String[] args){
        Character[] arr = {'C', 'F', 'I', 'L', 'O', 'S', 'V', 'Z'};
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int times = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if(str.charAt(i) <= arr[j] ){
                    times += j+3;
                    break;
                }
            }
        }
        System.out.print(times);
    }
}
