import java.util.*;

class Main_B1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int zero=0, one=0;
        for(int i=0; i<str.length(); i++){
            int num = str.charAt(i);
            if(num=='1'&&(i==0 || str.charAt(i-1)=='0')){
                one += 1;
            }
            if(num=='0'&&(i==0 || str.charAt(i-1)=='1')){
                zero += 1;
            }

        }
        
        System.out.println(Math.min(zero, one));
    }
}
