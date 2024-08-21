import java.util.*;

class Main_B9663 {
    static int count;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        count = 0;

        boolean[] cols = new boolean[N];
        boolean[] diag1 = new boolean[N*2];
        boolean[] diag2 = new boolean[N*2];

        func(0, cols, diag1, diag2);
        
        System.out.println(count);
    }

    public static void func(int r, boolean[] cols, boolean[] diag1, boolean[] diag2){

        if(r == N){
            count += 1;
            return;  
        }

        for(int col=0; col<N; col++){
            if(cols[col] || diag1[r-col+N] || diag2[r+col])  
                continue;

            cols[col] = true;
            diag1[r-col+N] = true;
            diag2[r+col] = true;

            func(r+1, cols, diag1, diag2);

            cols[col] = false;
            diag1[r-col+N] = false;
            diag2[r+col] = false;
            
        }        
    }
}
