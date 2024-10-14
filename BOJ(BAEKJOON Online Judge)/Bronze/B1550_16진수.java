import java.util.*; 

class Main_1550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = 0;
        int base = 1;
        for(int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if(Character.isDigit(c))
                result +=  (c - '0') * base;
            else 
                result += (c -'A'+10 ) * base;
            base *= 16;
        }
        System.out.println(result);
        sc.close();
    }
}
