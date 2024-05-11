import java.util.*;

public class Main_B1018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비
        char[][] chessboard = new char[N][M];
        int answer = 64;
        
        for(int i=0; i<N; i++){
            String str = sc.nextLine();
            for(int j=0; j<M; j++){
                 chessboard[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<=N-8; i++){
            for(int j=0; j<=M-8; j++){
                answer = Math.min(check(chessboard, i, j), answer);
            }
        }
        System.out.println(answer);
        sc.close();
    }

    private static int check(char[][] chessboard, int row, int col){
        int count1 = 0; // W로 시작
        int count2 = 0; // B로 시작
        for(int i=row; i<row+8; i++){
            for(int j=col; j<col+8; j++){
                char color = chessboard[i][j];
                if((i*8+i%2+j)%2==0){
                    if(color == 'B') count1 += 1;
                    else if(color == 'W') count2 += 1;
                }
                else {
                    if(color == 'B') count2 += 1;
                    else if(color == 'W') count1 += 1;
                }
            }
        }
        return Math.min(count1, count2);
    }
}
