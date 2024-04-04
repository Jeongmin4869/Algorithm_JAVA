import java.util.Scanner;

public class Main_B2675 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            // nextLine() 은 엔터값을 입력받을 때까지 기준으로 한 줄을 읽어버린다.
            // next() 는 공백을 기준으로 하나의 문자열만 읽어들인다.
            int num = sc.nextInt();
            String str = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                sb.append(String.valueOf(str.charAt(j)).repeat(num));
            }
            System.out.println(sb);
        }
    }
}
