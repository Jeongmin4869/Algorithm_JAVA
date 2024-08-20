import java.util.*;

class Main_B11729 {
    static int count;
    static StringBuilder sb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sb = new StringBuilder();
        count = 0;

        hanoi(N, 1, 3, 2);

        System.out.println(count);
        System.out.println(sb);
    }

    public static void hanoi(int num, int from, int to, int other){
        if(num==0) return;
        hanoi(num-1, from, other, to);
        sb.append(from + " " + to + "\n");
        hanoi(num-1, other, to, from);
        count += 1;
    }
}
