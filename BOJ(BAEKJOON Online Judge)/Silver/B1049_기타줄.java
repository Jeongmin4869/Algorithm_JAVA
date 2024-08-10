import java.util.*;

class Main_B1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] pack = new int[M];
        int[] unit = new int[M];
        for(int i=0; i<M; i++){
            pack[i] = sc.nextInt();
            unit[i] = sc.nextInt();
        }

        Arrays.sort(pack);
        Arrays.sort(unit);
        int answer = Math.min(N/6*pack[0] + N%6*unit[0], Math.min((N/6+1)*pack[0], N*unit[0]));        
        System.out.print(answer);
        sc.close();
    }

}
