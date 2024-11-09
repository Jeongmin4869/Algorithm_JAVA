import java.util.*;

class Main_B1333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int d = sc.nextInt();

        int playTime = n*l + (n-1)*5;

        for(int i=d; i<=playTime; i+=d){
            int now = i%(l+5);
            if(now >= l){
                System.out.println(i);
                return;
            }
        }
        System.out.println((playTime/d+1)*d );
    }
}
