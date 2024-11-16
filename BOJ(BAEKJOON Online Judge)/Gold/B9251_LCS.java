import java.util.*;

// LCS(Longest Common Subsequence, 최장 공통 부분 수열)
class Main_B9251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int[][] dp = new int[A.length()+1][B.length()+1];

        // dp
        for(int i=1; i<=A.length(); i++){
            for(int j=1; j<=B.length(); j++){
                if(A.charAt(i-1) == B.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        System.out.println(dp[A.length()][B.length()]);
        sc.close();
    }
}
