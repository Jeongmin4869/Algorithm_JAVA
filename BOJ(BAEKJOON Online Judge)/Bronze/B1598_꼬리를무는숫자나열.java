import java.io.*;

class Main_B1598 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int h = Math.abs((a-1)/4 - (b-1)/4);
        int v = Math.abs((a-1)%4 - (b-1)%4);

        System.out.println(h+v);
        sc.close();
    }
}
