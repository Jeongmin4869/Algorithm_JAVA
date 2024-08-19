import java.util.*; 

class Main_B2740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int M1 = sc.nextInt();
        int[][] arr1 = new int[N1][M1];
        for(int i=0; i<N1; i++){
            for(int j=0; j<M1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        int N2 = sc.nextInt();
        int M2 = sc.nextInt();
        int[][] arr2 = new int[N2][M2];
        for(int i=0; i<N2; i++){
            for(int j=0; j<M2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N1; i++){
            for(int j=0; j<M2; j++){
                int sum = 0;
                for(int k = 0; k<M1; k++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                sb.append(sum + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
