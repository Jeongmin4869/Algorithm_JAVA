import java.util.*;
public class Main_B2869 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        
        int answer = (int)Math.ceil((V-A)/(double)(A-B))+1;
        
        System.out.println(answer);
       
        sc.close();
    }
}
