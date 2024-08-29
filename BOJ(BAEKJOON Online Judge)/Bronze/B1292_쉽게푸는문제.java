import java.util.*;
class Main_B1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int currentnum = 1;
        int sum = 0;
        for(int i=1; i<=E; ){
            for(int j=0; i<=E && j<currentnum; j++){
                if(i>=S) sum +=currentnum;
                i++;
            }
            currentnum += 1;
        }
        System.out.println(sum);        
    }
}
