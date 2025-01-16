import java.util.*;

class Main_B2153{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(check(str)) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }

    public static boolean check(String str){
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLowerCase(c)){
                sum += c - 'a' + 1;
            }
            else if(Character.isUpperCase(c)){
                sum += c - 'A' + 27;
            }
        }
        
        boolean[] arr = new boolean[sum+1];

        arr[0] = true;
        for(int i=2; i<=sum; i++){
            for(int j=2; j*i<=sum; j++){
                arr[i*j] = true;
            }
        }
        return !arr[sum];        
    }
}
