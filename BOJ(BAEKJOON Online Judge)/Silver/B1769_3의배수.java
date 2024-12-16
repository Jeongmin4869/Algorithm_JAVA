import java.util.*;

class Main_B1769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int count = 0;
        while(num.length()>1){
            count += 1;
            num = getSum(num);
        }
        System.out.println(count);
        if(Integer.parseInt(num)%3==0)System.out.println("YES");
        else System.out.println("NO");
    }

    public static String getSum(String num){
        int sum = 0;
        for(int i=0; i<num.length(); i++){
            sum +=num.charAt(i)-'0';
        }
        return String.valueOf(sum);
    }
}
