import java.util.*;
import java.io.*;

class Main {
    static final int MOD = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N1; i++) arr1[i] = Integer.parseInt(st.nextToken());

        int N2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[N2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N2; i++) arr2[i] = Integer.parseInt(st.nextToken());

        long answer = 1;
        boolean padding = false;

        for (int i = 0; i < N1; i++) {
            for (int j = 0; j < N2; j++) {
                int g = gcd(arr1[i], arr2[j]);
                answer *= g;
                if (answer >= MOD) {
                    answer %= MOD;
                    padding = true;
                }
                arr1[i] /= g;
                arr2[j] /= g;
            }
        }

        if (padding) {
            System.out.printf("%09d\n", answer);
        } else {
            System.out.println(answer);
        }
    }

    public static int gcd(int a, int b){
        if(a%b==0) return b;
        return gcd(b, a%b);
    }
}
