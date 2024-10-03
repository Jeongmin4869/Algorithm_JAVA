import java.util.*;

class Main_B1213 {
    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[26];
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-'A'] += 1;
        }

        int oddcnt = 0;
        char odd = ' ';
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            if(arr[i]%2==1){
                odd = (char)(i+'A');
                oddcnt += 1;
                arr[i] -= 1;
            }
            if(oddcnt > 1){
                System.out.println("I'm Sorry Hansoo");
                return;
            }

            while(arr[i] > 0){
                sb.append((char)(i+'A'));
                arr[i] -=2;
            }
        }

        String left = sb.toString();
        String right = sb.reverse().toString();
        
        if(oddcnt != 0) System.out.println(left + odd + right);
        else System.out.println(left + right);

        sc.close();
    }

}
