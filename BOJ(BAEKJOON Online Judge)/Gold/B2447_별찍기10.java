import java.util.*;

class Main_B2447 {
    static String[][] arr ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        arr = new String[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = " ";
            }
        }
        
        func(0, 0, N);

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
        sc.close();
    }

    public static void func(int x, int y, int N){
        if(N == 1){
            arr[x][y] = "*";
            return;
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i == 1 && j == 1) continue;
                func(x + i*(N/3), y + j*(N/3) , N/3);
            }
        }
    }
}
