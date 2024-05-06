import java.util.*;

public class Main_B1193 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nu = 1, de = 1;
        int N = sc.nextInt();
        int s = 1;
        for(int i = 2; i<=N; i++){
            if(i*(i+1)/2 >= N){
                s = i;
                break;
            }
        }
        de = s;
        for(int i=s*(s-1)/2+1; i<N; i++){
            nu += 1;
            de -= 1;
        }

        if(s%2==0) System.out.println(nu + "/" + de);
        else System.out.println(de + "/" + nu);
        
        sc.close();
    }
}
