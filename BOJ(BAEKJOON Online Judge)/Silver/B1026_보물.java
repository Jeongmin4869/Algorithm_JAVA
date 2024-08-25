import java.util.*;

class Main_B1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        sc.nextLine();
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        sc.nextLine();
        for(int i=0; i<N; i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        boolean[] visited = new boolean[N]; // B를 재배엻하지 않고 구하는 법
        long sum = 0;
        for(int i=0; i<N; i++){
            int maxIndex = -1;
            for(int j=0; j<N; j++){
                if(!visited[j] && (maxIndex == -1 || B[maxIndex] < B[j]))
                    maxIndex = j;                
            }
            visited[maxIndex] = true;
            sum += A[i] * B[maxIndex];
        }
        
        System.out.print(sum);
        sc.close();
    }

}
